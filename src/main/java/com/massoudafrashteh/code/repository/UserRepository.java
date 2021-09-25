package com.massoudafrashteh.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.massoudafrashteh.code.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
