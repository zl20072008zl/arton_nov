package com.somoplay.artonexpress.service.mapper;

import com.somoplay.artonexpress.domain.*;
import com.somoplay.artonexpress.service.dto.ReceiptDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Receipt and its DTO ReceiptDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ReceiptMapper extends EntityMapper <ReceiptDTO, Receipt> {
    
    
    default Receipt fromId(Long id) {
        if (id == null) {
            return null;
        }
        Receipt receipt = new Receipt();
        receipt.setId(id);
        return receipt;
    }
}
