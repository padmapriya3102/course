package com.accolite.course.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.accolite.course.entities.CourseEntity;
import com.accolite.course.exception.NoContentException;
import com.accolite.course.models.Course;
import com.accolite.course.repositories.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public Course saveIntocourseItemTable(Course course) {
		CourseEntity entity = courseRepository.save(mapObjectToEntity(course));
		return mapEntityToObject(entity);
	}

	public CourseEntity mapObjectToEntity(Course course) {
		
		CourseEntity entity = new CourseEntity();
		entity.setId(course.getId());
		entity.setType(course.getType());
		entity.setTitle(course.getTitle());
		entity.setNumber(course.getNumber());
		entity.setNumCredits(course.getNumCredits());
		return entity;
	}

	

	public Course mapEntityToObject(CourseEntity entity) {
	
		Course course = new Course();
		course.setId(entity.getId());
		course.setType(entity.getType());
		course.setTitle(entity.getTitle());
		course.setNumber(entity.getNumber());
		course.setNumCredits(entity.getNumCredits());
	
		return course;
	}
	
	public Course fetchRecordFromcourseTable(Long id) throws NoContentException {
		
		Optional<CourseEntity> entity = courseRepository.findById(id);
		if(!entity.isPresent()) {
			throw new NoContentException(HttpStatus.NO_CONTENT);
		}
		return mapEntityToObject(entity.get());
	
}

	public Course updateRecordIntocourseTable(Course course) {
		CourseEntity entity = courseRepository.save(mapObjectToEntity(course));
		  return mapEntityToObject(entity);
		 
}
}