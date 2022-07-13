package com.example.JavaRestAPI_Task1.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "server")
public class Server {

	@Id
	private Integer id;
	private String name;
	private String language;
	private String framework;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getFramework() {
		return framework;
	}
	public void setFramework(String framework) {
		this.framework = framework;
	}
	@Override
	public String toString() {
		return "Server [id=" + id + ", name=" + name + ", language=" + language + ", framework=" + framework + "]";
	}
	
}

