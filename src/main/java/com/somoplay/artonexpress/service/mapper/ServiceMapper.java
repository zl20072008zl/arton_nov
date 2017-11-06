package com.somoplay.artonexpress.service.mapper;

import com.somoplay.artonexpress.domain.*;
import com.somoplay.artonexpress.service.dto.ServiceDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Service and its DTO ServiceDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ServiceMapper extends EntityMapper <ServiceDTO, Service> {
    
    
    default Service fromId(Long id) {
        if (id == null) {
            return null;
        }
        Service service = new Service();
        service.setId(id);
        return service;
    }
}
