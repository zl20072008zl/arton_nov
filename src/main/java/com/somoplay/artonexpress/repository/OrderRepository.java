package com.somoplay.artonexpress.repository;

import com.somoplay.artonexpress.domain.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the Order entity.
 */
@SuppressWarnings("unused")
@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    public Page<Order> findAllByUser(String login, Pageable pageable);
}
