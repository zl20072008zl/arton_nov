package com.somoplay.artonexpress.repository;

import com.somoplay.artonexpress.domain.Promotion;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the Promotion entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PromotionRepository extends JpaRepository<Promotion,Long> {
    
}
