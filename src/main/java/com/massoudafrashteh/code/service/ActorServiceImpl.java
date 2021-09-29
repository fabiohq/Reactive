package com.massoudafrashteh.code.service;

import java.util.NoSuchElementException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.massoudafrashteh.code.model.Actor;
import com.massoudafrashteh.code.repository.ActorRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
public class ActorServiceImpl implements IActorService{

	@Autowired
	ActorRepository actorRepo;
	@Override
	public Mono<Actor> save(Actor actor) {
		return Mono.just(this.actorRepo.save(actor));
	}

	@Override
	public Mono<Actor> findById(Long id) {
		return Mono.just(actorRepo.findById(id).orElseThrow(NoSuchElementException::new));
	}

	@Override
	public Flux<Actor> findAll() {
		return Flux.fromIterable(actorRepo.findAll());
	}

	@Override
	public Mono<Void> deleteById(Long id) {
		actorRepo.deleteById(id);
		return Mono.empty();
	}

}
