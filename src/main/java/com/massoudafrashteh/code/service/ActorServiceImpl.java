package com.massoudafrashteh.code.service;

import com.massoudafrashteh.code.model.Actor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ActorServiceImpl implements IActorService{

	@Override
	public Mono<Actor> save(Actor customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Actor> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<Actor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> deleteById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
