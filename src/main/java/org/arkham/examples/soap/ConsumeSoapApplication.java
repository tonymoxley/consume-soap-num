package org.arkham.examples.soap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The objective of this project is to create a REST Service that will communicate with SOAP Service, to convert a number
 * into words.
 * @author Ing. Antonio Hernandez
 * @version 1.0
 */
@SpringBootApplication
public class ConsumeSoapApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumeSoapApplication.class, args);
	}

}
