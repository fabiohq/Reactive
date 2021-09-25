package com.massoudafrashteh.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.massoudafrashteh.code.model.Person;

public interface PersonRepository extends JpaRepository<Person,Long>{

}
