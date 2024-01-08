package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * author : ms.Lee
 * date   : 2024-01-08
 */
@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

  @Autowired
  private CourseJdbcRepository repository;

  /*
  * spring application 시작시 실행할 논리가 있는 경우
  * 명령줄 실행을 사용할 수 있다.
  * alt + enter => implements method 실행
  * */

  @Override
  public void run(String... args) throws Exception {

    repository.insert(
        new Course(1, "Learn AWS Now!", "in28minutes")
    );
    repository.insert(
        new Course(2, "Learn Azure Now!", "in28minutes")
    );
    repository.insert(
        new Course(3, "Learn DevOps Now!", "in28minutes")
    );

    repository.deleteById( 1 );
  }
}
