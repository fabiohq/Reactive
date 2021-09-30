package com.massoudafrashteh.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.massoudafrashteh.code.model.Film;

public interface FilmRepository extends JpaRepository<Film, Long> {

}
