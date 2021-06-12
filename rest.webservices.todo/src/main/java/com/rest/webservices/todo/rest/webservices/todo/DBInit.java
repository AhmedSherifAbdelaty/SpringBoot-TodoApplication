package com.rest.webservices.todo.rest.webservices.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DBInit implements CommandLineRunner {

    @Autowired
    private TodoJpaRepository todoJpaRepository;


    @Override
    public void run(String... args) throws Exception {
        Todo todo = new Todo(1001, "user" , "learn java" , new Date() ,false);
        todoJpaRepository.save(todo);

        Todo todo1 = new Todo(1001, "user" , "learn Database" , new Date() ,false);
        todoJpaRepository.save(todo1);

        Todo todo2 = new Todo(1001, "user" , "learn Angular" , new Date() ,false);
        todoJpaRepository.save(todo2);
    }
}
