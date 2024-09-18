package com.kevinsouza.crudspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kevinsouza.crudspring.models.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
