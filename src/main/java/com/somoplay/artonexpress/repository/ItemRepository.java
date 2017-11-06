package com.somoplay.artonexpress.repository;

import com.somoplay.artonexpress.domain.Item;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the Item entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {
    
}
