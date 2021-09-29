package com.massoudafrashteh.code.service;

import java.util.NoSuchElementException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.massoudafrashteh.code.model.User;
import com.massoudafrashteh.code.repository.UserRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserRepository userRepo;
	@Override
	public Mono<User> save(User user) {
		// TODO Auto-generated method stub
		return Mono.just(userRepo.save(user));
	}

	@Override
	public Mono<User> findById(Long id) {
		// TODO Auto-generated method stub
		return Mono.just(userRepo.findById(id).orElseThrow(NoSuchElementException::new));
	}

	@Override
	public Flux<User> findAll() {
		// TODO Auto-generated method stub
		return Flux.fromIterable(userRepo.findAll());
	}

	@Override
	public Mono<Void> deleteById(Long id) {
		userRepo.deleteById(id);
		return Mono.empty();
	}

}
