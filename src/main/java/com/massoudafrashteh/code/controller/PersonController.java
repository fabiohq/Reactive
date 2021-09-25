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

import com.massoudafrashteh.code.model.Person;
import com.massoudafrashteh.code.service.IPersonService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping (name = "person")
public class PersonController {

	@Autowired
	private IPersonService personService;
	
	@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Person> save(@RequestBody Person person) {
        return personService.save(person);
    }

    @GetMapping("/{id}")
    public Mono<Person> findById(@PathVariable("id") Long id) {
        return personService.findById(id);
    }

    @GetMapping
    public Flux<Person> findAll() {
        return personService.findAll();
    }

    @DeleteMapping("{id}")
    public Mono<Void> deleteById(@PathVariable("id") Long id) {
        return personService.deleteById(id);
    }
}
