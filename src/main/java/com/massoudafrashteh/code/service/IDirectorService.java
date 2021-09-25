package com.massoudafrashteh.code.service;

import com.massoudafrashteh.code.model.Director;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IDirectorService {
	Mono<Director> save(Director director);
    Mono<Director> findById(Long id);
    Flux<Director> findAll();
    Mono<Void> deleteById(Long id);
}
