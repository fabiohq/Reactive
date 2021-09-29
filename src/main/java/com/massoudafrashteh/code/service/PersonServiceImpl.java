package com.massoudafrashteh.code.service;

import java.util.NoSuchElementException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.massoudafrashteh.code.model.Person;
import com.massoudafrashteh.code.repository.PersonRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
public class PersonServiceImpl implements IPersonService{

	@Autowired
	private PersonRepository personRepo;
	@Override
	public Mono<Person> save(Person person) {
		// TODO Auto-generated method stub
		return Mono.just(personRepo.save(person));
	}

	@Override
	public Mono<Person> findById(Long id) {
		// TODO Auto-generated method stub
		return Mono.just(personRepo.findById(id).orElseThrow(NoSuchElementException::new));
	}

	@Override
	public Flux<Person> findAll() {
		// TODO Auto-generated method stub
		return Flux.fromIterable(personRepo.findAll());
	}

	@Override
	public Mono<Void> deleteById(Long id) {
		personRepo.deleteById(id);
		return Mono.empty();
	}

}
