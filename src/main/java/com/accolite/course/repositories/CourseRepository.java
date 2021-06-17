package com.accolite.course.repositories;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.accolite.course.entities.CourseEntity;



@Repository
public interface CourseRepository extends CrudRepository<CourseEntity, Long> {

	
}
