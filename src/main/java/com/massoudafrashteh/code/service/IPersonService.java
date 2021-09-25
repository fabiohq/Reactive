package com.massoudafrashteh.code.service;

import com.massoudafrashteh.code.model.Person;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IPersonService {

	Mono<Person> save(Person person);
	Mono<Person> findById(Long id);
	Flux<Person> findAll();
	Mono<Void> deleteById(Long id);
}
