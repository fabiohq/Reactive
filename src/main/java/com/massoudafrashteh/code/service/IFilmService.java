package com.massoudafrashteh.code.service;

import com.massoudafrashteh.code.model.Film;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IFilmService {

	Mono<Film> save(Film film);
    Mono<Film> findById(Long id);
    Flux<Film> findAll();
    Mono<Void> deleteById(Long id);
}
