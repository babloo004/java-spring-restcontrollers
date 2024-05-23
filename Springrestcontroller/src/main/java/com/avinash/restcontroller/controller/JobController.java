package com.avinash.restcontroller.controller;

import com.avinash.restcontroller.model.JobPost;
import com.avinash.restcontroller.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //declaring the Rest Controller by Annotation
//in normal controllers we will use @RequestMapping() annotation for url mapping
//but here we will use @GetMapping() for GET request
//we will use @PostMapping() for POST request
//we will use @PutMapping() for PUT request for updating data
//we will use @DeleteMapping() for DELETE request

//if a client send the data to the server we need to store that data in our model object
//the above process is known as data Binding
//to do data binding we use an annotation name "@RequestBody"

//client will send us the json data, but the data is casted into the model object
//this is done by Jackson framework, used by the spring framework
//by default spring will add dependency to convert the json data only
//if you want to work with xml, then you should add the xml jackson dependency also

//if you want to restrict the type of content to be sent or received we will use attribute inside Urlmapping annotation
//@Produces="application/json" to send only json data to client
//@Produces="application/xml" to send only xml data to client
//@Consumes="application/json" to receive only json data from client
//@Consumes="application/xml" to receive only xml data from client
public class JobController {

    //Service object
    @Autowired
    JobService service;


    @GetMapping(value = "/jobs",produces = "application/json")
    public List<JobPost> fetchAll(){
        return service.fetchAll();
    }

    @PostMapping("/job")
    public List<JobPost> addJob(@RequestBody JobPost job){
        service.addJob(job);
        return service.fetchAll();
    }
}
