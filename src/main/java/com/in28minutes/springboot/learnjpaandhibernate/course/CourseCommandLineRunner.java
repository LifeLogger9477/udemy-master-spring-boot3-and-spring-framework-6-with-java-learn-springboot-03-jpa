package com.in28minutes.springboot.learnjpaandhibernate.course;

import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * author : ms.Lee
 * date   : 2024-01-08
 */
@Component
public class CourseCommandLineRunner implements CommandLineRunner {

  // jdbc
//  @Autowired
//  private CourseJdbcRepository repository;

  // jpa
  @Autowired
  private CourseJpaRepository repository;

  /*
  * spring application 시작시 실행할 논리가 있는 경우
  * 명령줄 실행을 사용할 수 있다.
  * alt + enter => implements method 실행
  * */

  @Override
  public void run(String... args) throws Exception {

    repository.insert(
        new Course(1, "Learn AWS Jpa!", "in28minutes")
    );
    repository.insert(
        new Course(2, "Learn Azure Jpa!", "in28minutes")
    );
    repository.insert(
        new Course(3, "Learn DevOps Jpa!", "in28minutes")
    );

    repository.deleteById( 1 );

    System.out.println(repository.findById( 2 ));
    System.out.println(repository.findById( 3 ));
  }
}
