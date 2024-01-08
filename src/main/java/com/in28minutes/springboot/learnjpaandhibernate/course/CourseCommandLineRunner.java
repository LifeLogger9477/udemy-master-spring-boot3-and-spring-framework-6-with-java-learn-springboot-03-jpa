package com.in28minutes.springboot.learnjpaandhibernate.course;

import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
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
//  @Autowired
//  private CourseJpaRepository repository;

  @Autowired
  private CourseSpringDataJpaRepository repository;

  /*
  * spring application 시작시 실행할 논리가 있는 경우
  * 명령줄 실행을 사용할 수 있다.
  * alt + enter => implements method 실행
  * */

  @Override
  public void run(String... args) throws Exception {

    // jdbc + jpa
    /*
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
    */

    // Spring Data Jpa
    repository.save(
        new Course(1, "Learn AWS Jpa!", "in28minutes")
    );
    repository.save(
        new Course(2, "Learn Azure Jpa!", "in28minutes")
    );
    repository.save(
        new Course(3, "Learn DevOps Jpa!", "in28minutes")
    );

    repository.deleteById( 1L );

    System.out.println(repository.findById( 2L ));
    System.out.println(repository.findById( 3L ));

    // 기능 추가 확인
    System.out.println(repository.findAll());
    System.out.println(repository.count());

    System.out.println(repository.findByAuthor( "in28minutes" ));
    System.out.println(repository.findByAuthor( "" ));

    System.out.println(repository.findByName( "Learn AWS Jpa!" ));
    System.out.println(repository.findByName( "Learn DevOps Jpa!" ));
  }
}
