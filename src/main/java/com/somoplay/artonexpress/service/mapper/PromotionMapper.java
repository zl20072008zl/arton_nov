package com.somoplay.artonexpress.service.mapper;

import com.somoplay.artonexpress.domain.*;
import com.somoplay.artonexpress.service.dto.PromotionDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Promotion and its DTO PromotionDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface PromotionMapper extends EntityMapper <PromotionDTO, Promotion> {
    
    
    default Promotion fromId(Long id) {
        if (id == null) {
            return null;
        }
        Promotion promotion = new Promotion();
        promotion.setId(id);
        return promotion;
    }
}
