package com.avinash.restcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//REST
//REST stands for Representational State Transfer.
//why we need to use REST?
//let's consider a situation, a company needs a website and mobile app
//if we use normal controllers, in website we will return the view Technology to the client
//coming to the mobile app we need to return another view technology
//so we need to maintain two servers here
//but what if we return just data to the client and then the depending upon the website/mobile the data will be proccessed at front end
//this process is possible with REST
//in REST we will return the data in the json format or XML format
//we will declare the rest controllers with annotation @RestController
//in REST we will use stateless communication
//no client session information will be stored in the server side
//each request wil be considered new, each request must contain all the necessary information
//in REST the urls are of pronoun type, we dont include verbs/actions in the url
//they will contain same urls but of different methods

//lets create a RestContoller

//lets create a Model to work with
@SpringBootApplication
public class RestcontrollerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestcontrollerApplication.class, args);
		System.out.println("Hello World...!");
	}

}
