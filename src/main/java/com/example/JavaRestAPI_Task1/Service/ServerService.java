package com.example.JavaRestAPI_Task1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.JavaRestAPI_Task1.Entity.Server;
import com.example.JavaRestAPI_Task1.Exception.IdNotFoundException;
import com.example.JavaRestAPI_Task1.Exception.ServerNameNotFoundException;
import com.example.JavaRestAPI_Task1.Repository.ServerRepo;

@Service
public class ServerService {

	@Autowired
	ServerRepo serverRepo;
	
	public List<Server> getAllServer(){
		return serverRepo.findAll();
	}
	
	public Server returnServerByID(Integer id){
		
		return serverRepo.findById(id)
			      .orElseThrow(() -> new IdNotFoundException(HttpStatus.NOT_FOUND));
		
	}

	public List<Server> searchByName(String name){
		
		List<Server> serverDetails =  serverRepo.searchByName(name);
		if(serverDetails.isEmpty()) {
			throw new ServerNameNotFoundException(HttpStatus.NOT_FOUND);
		}
		else {
			return serverDetails;
		}
	}
	public void deleteServerByID(Integer id) {
		
		serverRepo.deleteById(id);	
	}
	
	public Server updateData(Server newServer) {
		
		return serverRepo.save(newServer);
		
	}
	
}

