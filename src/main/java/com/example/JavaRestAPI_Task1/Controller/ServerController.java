package com.example.JavaRestAPI_Task1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.JavaRestAPI_Task1.Entity.Server;
import com.example.JavaRestAPI_Task1.Service.ServerService;

@RestController
public class ServerController {

	@Autowired
	ServerService serverService;

	// To get all the server details
	@GetMapping("/server")
	public List<Server> getAllServer() {

		return serverService.getAllServer();
	}

	// To get the particular server by passing Id as a parameter
	@GetMapping("/serverId/{id}")
	public Server serverByID(@PathVariable("id") Integer id) {
		return serverService.returnServerByID(id);
	}

	// To update and create server
	@PutMapping("/updateData")
	public Server updateData(@RequestBody Server newServer) {

		return serverService.updateData(newServer);
	}

	// Pass the parameter to delete the server from the database
	@DeleteMapping("/deleteServerByID/{id}")
	public void deleteServer(@PathVariable("id") Integer id) {

		serverService.deleteServerByID(id);
	}

	// To get the server by name @GetMapping("/searchByName/{name}")
	public List<Server> searchByName(@PathVariable("name") String name) {

		return serverService.searchByName(name);
	}
}
