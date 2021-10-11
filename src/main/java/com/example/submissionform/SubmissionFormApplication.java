package com.example.submissionform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class SubmissionFormApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return  application.sources(SubmissionFormApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(SubmissionFormApplication.class, args);
    }

}
