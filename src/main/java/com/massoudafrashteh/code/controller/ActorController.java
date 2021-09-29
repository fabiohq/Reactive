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

import com.massoudafrashteh.code.model.Actor;
import com.massoudafrashteh.code.service.IActorService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/actors")
public class ActorController {
	@Autowired
	private IActorService actorService;
	
	@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Actor> save(@RequestBody Actor actor) {
        return actorService.save(actor);
    }

    @GetMapping("/{id}")
    public Mono<Actor> findById(@PathVariable("id") Long id) {
        return actorService.findById(id);
    }

    @GetMapping
    public Flux<Actor> findAll() {
        return actorService.findAll();
    }

    @DeleteMapping("{id}")
    public Mono<Void> deleteById(@PathVariable("id") Long id) {
        return actorService.deleteById(id);
    }

}
