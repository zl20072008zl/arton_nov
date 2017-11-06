package com.somoplay.artonexpress.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.somoplay.artonexpress.domain.ExpressAccount;

import com.somoplay.artonexpress.repository.ExpressAccountRepository;
import com.somoplay.artonexpress.web.rest.util.HeaderUtil;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing ExpressAccount.
 */
@RestController
@RequestMapping("/api")
public class ExpressAccountResource {

    private final Logger log = LoggerFactory.getLogger(ExpressAccountResource.class);

    private static final String ENTITY_NAME = "expressAccount";

    private final ExpressAccountRepository expressAccountRepository;

    public ExpressAccountResource(ExpressAccountRepository expressAccountRepository) {
        this.expressAccountRepository = expressAccountRepository;
    }

    /**
     * POST  /express-accounts : Create a new expressAccount.
     *
     * @param expressAccount the expressAccount to create
     * @return the ResponseEntity with status 201 (Created) and with body the new expressAccount, or with status 400 (Bad Request) if the expressAccount has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/express-accounts")
    @Timed
    public ResponseEntity<ExpressAccount> createExpressAccount(@RequestBody ExpressAccount expressAccount) throws URISyntaxException {
        log.debug("REST request to save ExpressAccount : {}", expressAccount);
        if (expressAccount.getId() != null) {
            return ResponseEntity.badRequest().headers(HeaderUtil.createFailureAlert(ENTITY_NAME, "idexists", "A new expressAccount cannot already have an ID")).body(null);
        }
        ExpressAccount result = expressAccountRepository.save(expressAccount);
        return ResponseEntity.created(new URI("/api/express-accounts/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /express-accounts : Updates an existing expressAccount.
     *
     * @param expressAccount the expressAccount to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated expressAccount,
     * or with status 400 (Bad Request) if the expressAccount is not valid,
     * or with status 500 (Internal Server Error) if the expressAccount couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/express-accounts")
    @Timed
    public ResponseEntity<ExpressAccount> updateExpressAccount(@RequestBody ExpressAccount expressAccount) throws URISyntaxException {
        log.debug("REST request to update ExpressAccount : {}", expressAccount);
        if (expressAccount.getId() == null) {
            return createExpressAccount(expressAccount);
        }
        ExpressAccount result = expressAccountRepository.save(expressAccount);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, expressAccount.getId().toString()))
            .body(result);
    }

    /**
     * GET  /express-accounts : get all the expressAccounts.
     *
     * @return the ResponseEntity with status 200 (OK) and the list of expressAccounts in body
     */
    @GetMapping("/express-accounts")
    @Timed
    public List<ExpressAccount> getAllExpressAccounts() {
        log.debug("REST request to get all ExpressAccounts");
        return expressAccountRepository.findAll();
    }

    /**
     * GET  /express-accounts/:id : get the "id" expressAccount.
     *
     * @param id the id of the expressAccount to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the expressAccount, or with status 404 (Not Found)
     */
    @GetMapping("/express-accounts/{id}")
    @Timed
    public ResponseEntity<ExpressAccount> getExpressAccount(@PathVariable Long id) {
        log.debug("REST request to get ExpressAccount : {}", id);
        ExpressAccount expressAccount = expressAccountRepository.findOne(id);
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(expressAccount));
    }

    /**
     * DELETE  /express-accounts/:id : delete the "id" expressAccount.
     *
     * @param id the id of the expressAccount to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/express-accounts/{id}")
    @Timed
    public ResponseEntity<Void> deleteExpressAccount(@PathVariable Long id) {
        log.debug("REST request to delete ExpressAccount : {}", id);
        expressAccountRepository.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }
}
