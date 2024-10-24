package com.pisomka.Pisomka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class PisomkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PisomkaApplication.class, args);
	}

}
