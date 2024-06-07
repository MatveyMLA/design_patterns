package com.mati.items.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.mati.items.domain.Item;

import reactor.core.publisher.Flux;

public interface ItemsRepository extends ReactiveMongoRepository<Item, String>{
	
	Flux<Item> findByName(String name);
	
}
