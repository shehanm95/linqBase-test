package com.example.linqbase.controller;

import com.example.linqbase.entity.Student;
import com.example.linqbase.repo.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentRepo repository;

    @GetMapping("/students")
    List<Student> findAll() {
        return repository.findAll();
    }

}
