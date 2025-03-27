package com.example.couchbasetask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@SpringBootApplication
@EnableCouchbaseRepositories
public class CouchbaseTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouchbaseTaskApplication.class, args);
	}
}
