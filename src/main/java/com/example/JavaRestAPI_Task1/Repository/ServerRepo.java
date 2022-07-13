package com.example.JavaRestAPI_Task1.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.JavaRestAPI_Task1.Entity.Server;

public interface ServerRepo extends MongoRepository<Server, Integer> {

	@Query("{ 'name' : { '$in' : [ ?0 ] } }")
	List<Server> searchByName(String name);
	
}
