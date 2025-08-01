package com.tech.spring.boot.docker.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerK8sApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerK8sApplication.class, args);
	}

	@GetMapping("/message")
	public String getMessage() {
		return "Congratulation you have successfully deployed your application to kubernetes !!";
	}
}
