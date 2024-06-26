package com.avinash.restcontroller.repo;

import com.avinash.restcontroller.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobRepo {
    //we want dummy data to store
    //let's create a ArrayList to store JobPost objects
    List<JobPost> jobs = new ArrayList<JobPost>();

    //whenever we call the constructor, it must add all the JobPost objects to the jobs
    //constructor
    public JobRepo(){
        // Java Developer Job Post
        jobs.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));

        // Frontend Developer Job Post
        jobs.add(new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
                        3, List.of("HTML", "CSS", "JavaScript", "React")));

        // Data Scientist Job Post
        jobs.add(new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                List.of("Python", "Machine Learning", "Data Analysis")));

        // Network Engineer Job Post
        jobs.add(new JobPost(4, "Network Engineer",
                "Design and implement computer networks for efficient data communication", 5,
                List.of("Networking", "Cisco", "Routing", "Switching")));

        // Mobile App Developer Job Post
        jobs.add(new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android",
                        3, List.of("iOS Development", "Android Development", "Mobile App")));
    }

    //method to fetch all the jobs
    public List<JobPost> fetchAll(){
        return jobs;
    }

    //method to add job
    public void addJob(JobPost job){
        jobs.add(job);
    }
}
