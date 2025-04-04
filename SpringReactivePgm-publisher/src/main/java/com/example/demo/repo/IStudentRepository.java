package com.example.demo.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.demo.entity.Student;

public interface IStudentRepository extends ReactiveMongoRepository<Student, String> {

}
