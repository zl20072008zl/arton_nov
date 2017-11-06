package com.somoplay.artonexpress.service.mapper;

import com.somoplay.artonexpress.domain.*;
import com.somoplay.artonexpress.service.dto.OrderDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Order and its DTO OrderDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface OrderMapper extends EntityMapper <OrderDTO, Order> {
    
    
    default Order fromId(Long id) {
        if (id == null) {
            return null;
        }
        Order order = new Order();
        order.setId(id);
        return order;
    }
}
