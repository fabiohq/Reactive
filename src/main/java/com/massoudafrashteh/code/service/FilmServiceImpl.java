package com.massoudafrashteh.code.service;

import java.util.NoSuchElementException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.massoudafrashteh.code.model.Film;
import com.massoudafrashteh.code.repository.FilmRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
public class FilmServiceImpl implements IFilmService{

	@Autowired
	private FilmRepository filmRepo;
	@Override
	public Mono<Film> save(Film film) {
		// TODO Auto-generated method stub
		return Mono.just(filmRepo.save(film));
	}

	@Override
	public Mono<Film> findById(Long id) {
		// TODO Auto-generated method stub
		return Mono.just(filmRepo.findById(id).orElseThrow(NoSuchElementException::new));
	}

	@Override
	public Flux<Film> findAll() {
		// TODO Auto-generated method stub
		return Flux.fromIterable(filmRepo.findAll());
	}

	@Override
	public Mono<Void> deleteById(Long id) {
		filmRepo.deleteById(id);
		return Mono.empty();
	}

}
