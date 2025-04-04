package com.example.demo.service;

import com.example.demo.entity.Student;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IStudentService {
	
	public Mono<Student> saveStudent(Student student);
	public Mono<Student> getStudent(String id);
	public Flux<Student> findAllStudents();
	public Mono<Void> deleteStudent(String id);
	
}
