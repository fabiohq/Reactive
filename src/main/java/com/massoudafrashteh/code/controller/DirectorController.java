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

import com.massoudafrashteh.code.model.Director;
import com.massoudafrashteh.code.service.IDirectorService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(name = "director")
public class DirectorController {

	@Autowired
	private IDirectorService directorService;
	
	@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Director> save(@RequestBody Director director) {
        return directorService.save(director);
    }

    @GetMapping("/{id}")
    public Mono<Director> findById(@PathVariable("id") Long id) {
        return directorService.findById(id);
    }

    @GetMapping
    public Flux<Director> findAll() {
        return directorService.findAll();
    }

    @DeleteMapping("{id}")
    public Mono<Void> deleteById(@PathVariable("id") Long id) {
        return directorService.deleteById(id);
    }
}
