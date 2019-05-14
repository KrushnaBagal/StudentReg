package com.tcs.dao;

import org.springframework.data.repository.CrudRepository;

import com.tcs.model.StudentModel;

public interface StudentRepository extends CrudRepository<StudentModel, Integer> {

}
