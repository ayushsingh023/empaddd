package com.task2.empaddd.repository;

import com.task2.empaddd.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
