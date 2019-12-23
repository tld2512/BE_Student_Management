package com.example.module4backendstudentmange;

import codegym.repository.SyllabusRepository;
import codegym.service.ObjectiveService;
import codegym.service.SyllabusService;
import codegym.service.impl.IObjectiveService;
import codegym.service.impl.ISyllabusService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@Configuration
@EntityScan("codegym.model")
@ComponentScan("codegym.controller")
@EnableJpaRepositories("codegym.repository")
@EnableTransactionManagement
@EnableWebMvc
@EnableSpringDataWebSupport
public class Module4backendstudentmangeApplication {

    @Bean
    public SyllabusService syllabusService() {
        return new ISyllabusService();
    }

    @Bean
    public ObjectiveService objectiveService() {
        return new IObjectiveService();
    }

    public static void main(String[] args) {
        SpringApplication.run(Module4backendstudentmangeApplication.class, args);
    }

}
