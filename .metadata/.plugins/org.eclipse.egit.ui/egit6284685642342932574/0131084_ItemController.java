package com.mati.items.controller;

import java.math.BigDecimal;

import org.bson.types.ObjectId;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.mongodb.core.query.UntypedExampleMatcher;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mati.items.domain.Item;
import com.mati.items.repository.ItemsRepository;

import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Log4j2
@RestController
@RequestMapping("/items")
public class ItemController {

	
	private final ItemsRepository itemsRepo;

	public ItemController(ItemsRepository itemsRepo) {
		this.itemsRepo = itemsRepo;
	}

	@GetMapping("/all")
	public Flux<Item> getAllItems() {
		
		log.info("Start ItemController.getAllItems()");
		return itemsRepo.findAll()
			.map(item -> {
		      item.setPrice(item.getPrice().add(new BigDecimal(100d)));
		      return item;
		    });
	}

	@PostMapping("/example")
	public Flux<Item> getByName(@RequestBody Item item) {
		log.info("Start ItemController.getByName(Item)");
		ExampleMatcher matcher = UntypedExampleMatcher.matching()
		        .withIgnoreNullValues()
		        .withIgnoreCase();
		
		return itemsRepo.findAll(Example.of(item, matcher));
	}
	
	@GetMapping("/{id}")
	public Mono<Item> getBiId(@PathVariable String id) {
		log.info("Start ItemController.getBiId(id)");
		return itemsRepo.findById(id);
	}
	
	@GetMapping("/name/{name}")
	public Flux<Item> getByName(@PathVariable String name) {
		log.info("Start ItemController.getByName(name)");
		return itemsRepo.findByName(name);
	}
	
	@DeleteMapping("/{id}")
	public Mono<Boolean> deleteItem(@PathVariable String id) {
		log.info("Start ItemController.deleteItem(id)");
		itemsRepo.deleteById(id).subscribe();
		return itemsRepo.existsById(id).map(isExist -> !isExist);
	}
	
	@PostMapping("")
	public Mono<Item> saveItem(@RequestBody Item item) {
		log.info("Start ItemController.saveItem(item)");		
		return itemsRepo.save(item);
	}
}
