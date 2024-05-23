package com.avinash.restcontroller.service;

import com.avinash.restcontroller.model.JobPost;
import com.avinash.restcontroller.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    //JobRepo object to access the methods
    @Autowired
    JobRepo repo;
    //methods

    //to add job
    public void addJob(JobPost job){
        repo.addJob(job);
    }

    //to fetch all jobs
    public List<JobPost> fetchAll(){
        return repo.fetchAll();
    }
}
