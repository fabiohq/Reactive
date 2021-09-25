package com.massoudafrashteh.code.service;

import com.massoudafrashteh.code.model.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IUserService {

	Mono<User> save(User user);
	Mono<User> findById(Long id);
	Flux<User> findAll();
	Mono<Void> deleteById(Long id);
}
