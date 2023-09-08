package com.programming.SpringBootConcept.SpringMVCBootJavaProject.repository;

import com.programming.SpringBootConcept.SpringMVCBootJavaProject.beans.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {


}
