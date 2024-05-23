package com.avinash.restcontroller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

//in our pom file we have used a dependency, known as lombok
//it is responsible for reducing the code for creating the setters and getter
//responsible for creating Constructors
//by annotations
@Data //creates getters and setters
@NoArgsConstructor
@AllArgsConstructor
@Component
public class JobPost {
    private int postId;
    private String postProfile;
    private String postDesc;
    private Integer reqExperience;
    private List<String> postTechStack;

}
