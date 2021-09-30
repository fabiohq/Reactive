package com.massoudafrashteh.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.massoudafrashteh.code.model.Film;
import com.massoudafrashteh.code.service.IFilmService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/films")
public class FilmController {
	@Autowired
	private IFilmService filmService;
	
	@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Film> save(@RequestBody Film film) {
        return filmService.save(film);
    }

    @GetMapping("/{id}")
    public Mono<Film> findById(@PathVariable("id") Long id) {
        return filmService.findById(id);
    }

    @GetMapping
    public Flux<Film> findAll() {
        return filmService.findAll();
    }

    @DeleteMapping("{id}")
    public Mono<Void> deleteById(@PathVariable("id") Long id) {
        return filmService.deleteById(id);
    }
}
