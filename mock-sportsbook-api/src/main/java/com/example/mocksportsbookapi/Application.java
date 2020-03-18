package com.example.mocksportsbookapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@RestController
	public static class ApiController {
            @Value("${hostname}")
            private String podName; 

		@GetMapping("/api")
	    public String index() {
               return "Hello from " + podName;
            }
	}

}
