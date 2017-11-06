package com.somoplay.artonexpress.service.mapper;

import com.somoplay.artonexpress.domain.*;
import com.somoplay.artonexpress.service.dto.AddressDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Address and its DTO AddressDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface AddressMapper extends EntityMapper <AddressDTO, Address> {
    
    
    default Address fromId(Long id) {
        if (id == null) {
            return null;
        }
        Address address = new Address();
        address.setId(id);
        return address;
    }
}
