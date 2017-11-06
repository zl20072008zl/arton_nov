package com.somoplay.artonexpress.web.rest;

import com.somoplay.artonexpress.country.CountryState;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by limingyang on 2017/8/7.
 */
@RequestMapping("/api/country")
@RestController
public class CountryListResource {
    private static final String filename = "country.json";
    private JSONObject jsonObject;

    @RequestMapping(value = "/list",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CountryState> country_list() throws IOException, JSONException {
        getJSONObject();
        List<CountryState> countries = new ArrayList<>();

        Iterator<?> keys = jsonObject.keys();

        while( keys.hasNext() ) {
            String key = (String)keys.next();
            if ( jsonObject.get(key) instanceof JSONObject ) {
                CountryState countryState = new CountryState();
                JSONObject country = (JSONObject) jsonObject.get(key);
                JSONObject names = (JSONObject) country.get("names");
                countryState.setName((String) names.get("geonames"));
                countryState.setValue((String) country.get("iso"));
                countries.add(countryState);
            }
        }

        return countries;
    }

    @RequestMapping(value = "/retrieve/{code}",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CountryState> state_list(@PathVariable String code) throws IOException, JSONException {
        getJSONObject();
        List<CountryState> provinces = new ArrayList<>();

        if ( jsonObject.get(code) instanceof JSONObject ) {
            JSONObject country = (JSONObject) jsonObject.get(code);
            JSONArray states = (JSONArray) country.get("regions");

            for (int i = 0; i < states.length(); i++) {
                CountryState countryState = new CountryState();
                JSONObject state = (JSONObject) states.get(i);
                countryState.setName((String) state.get("name"));
                countryState.setValue((String) state.get("iso"));
                provinces.add(countryState);
            }
        }

        return provinces;
    }

    @RequestMapping(value = "/retrieve/{country}/{state}",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CountryState state(@PathVariable String country, @PathVariable String state) throws IOException, JSONException {
        getJSONObject();

        CountryState countryState = new CountryState();

        if ( jsonObject.get(country) instanceof JSONObject ) {
            JSONObject countries = (JSONObject) jsonObject.get(country);
            JSONArray states = (JSONArray) countries.get("regions");

            for (int i = 0; i < states.length(); i++) {
                JSONObject obj = (JSONObject) states.get(i);
                if (((String) obj.get("iso")).equalsIgnoreCase(state)) {
                    countryState.setValue((String) obj.get("iso"));
                    countryState.setName((String) obj.get("name"));
                }
            }
        }

        return countryState;
    }

    private void getJSONObject() throws IOException, JSONException {
        setJsonObject(parseJSONFile(filename));
    }

    private static JSONObject parseJSONFile(String filename) throws JSONException, IOException {
        String content = new String(Files.readAllBytes(Paths.get(filename)));
        return new JSONObject(content);
    }

    private void setJsonObject(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }
}
