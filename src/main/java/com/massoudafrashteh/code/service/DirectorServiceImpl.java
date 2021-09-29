package com.massoudafrashteh.code.service;

import java.util.NoSuchElementException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.massoudafrashteh.code.model.Director;
import com.massoudafrashteh.code.repository.DirectorRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
public class DirectorServiceImpl implements IDirectorService{

	@Autowired
	private DirectorRepository directorRepo;
	@Override
	public Mono<Director> save(Director director) {
		// TODO Auto-generated method stub
		return Mono.just(directorRepo.save(director));
	}

	@Override
	public Mono<Director> findById(Long id) {
		// TODO Auto-generated method stub
		return Mono.just(directorRepo.findById(id).orElseThrow(NoSuchElementException::new));
	}

	@Override
	public Flux<Director> findAll() {
		// TODO Auto-generated method stub
		return Flux.fromIterable(directorRepo.findAll());
	}

	@Override
	public Mono<Void> deleteById(Long id) {
		directorRepo.deleteById(id);
		return Mono.empty();
	}

}
