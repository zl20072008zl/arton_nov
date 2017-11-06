package com.somoplay.artonexpress.repository;

import com.somoplay.artonexpress.domain.Address;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the Address entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
    public Page<Address> findAllByUser(String login, Pageable pageable);
}
