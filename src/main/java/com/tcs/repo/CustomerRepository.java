package com.tcs.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Serializable>  {

}
