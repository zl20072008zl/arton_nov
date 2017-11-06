package com.somoplay.artonexpress.repository;

import com.somoplay.artonexpress.domain.Receipt;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the Receipt entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ReceiptRepository extends JpaRepository<Receipt,Long> {
    
}
