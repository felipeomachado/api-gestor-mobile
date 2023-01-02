package br.com.cadsma.gestormobileapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class GestorMobileApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestorMobileApiApplication.class, args);
	}

}
