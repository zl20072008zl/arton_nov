package com.somoplay.artonexpress.repository;

import com.somoplay.artonexpress.domain.ExpressAccount;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the ExpressAccount entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ExpressAccountRepository extends JpaRepository<ExpressAccount,Long> {
    
}
