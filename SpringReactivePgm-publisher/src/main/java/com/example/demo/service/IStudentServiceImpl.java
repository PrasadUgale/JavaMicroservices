package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.IStudentRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class IStudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentRepository repository;
	
	@Override
	public Mono<Student> saveStudent(Student student) {
		return repository.save(student);
	}

	@Override
	public Mono<Student> getStudent(String id) {
		return repository.findById(id).switchIfEmpty(Mono.empty());
	}

	@Override
	public Flux<Student> findAllStudents() {
		return repository.findAll();
	}

	@Override
	public Mono<Void> deleteStudent(String id) {
		return repository.deleteById(id);
	}

}
