package com.somoplay.artonexpress.service.mapper;

import com.somoplay.artonexpress.domain.*;
import com.somoplay.artonexpress.service.dto.AdsDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Ads and its DTO AdsDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface AdsMapper extends EntityMapper <AdsDTO, Ads> {
    
    
    default Ads fromId(Long id) {
        if (id == null) {
            return null;
        }
        Ads ads = new Ads();
        ads.setId(id);
        return ads;
    }
}
