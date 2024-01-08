package com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * author : ms.Lee
 * date   : 2024-01-08
 */
public interface CourseSpringDataJpaRepository
    extends JpaRepository<Course, Long> {


}
