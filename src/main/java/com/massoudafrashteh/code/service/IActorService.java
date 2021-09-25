package com.massoudafrashteh.code.service;

import com.massoudafrashteh.code.model.Actor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IActorService {
	Mono<Actor> save(Actor customer);
    Mono<Actor> findById(Long id);
    Flux<Actor> findAll();
    Mono<Void> deleteById(Long id);
}
