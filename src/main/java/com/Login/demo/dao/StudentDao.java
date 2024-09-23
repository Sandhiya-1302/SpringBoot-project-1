package com.Login.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Login.demo.entity.StudentDetails;

@Repository
public interface StudentDao extends CrudRepository<StudentDetails, Integer>{

}
