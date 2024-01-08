package com.in28minutes.springboot.learnjpaandhibernate.course;

/**
 * author : ms.Lee
 * date   : 2024-01-08
 */
public class Course {

  private long id;
  private String name;
  private String author;

  // constructor
  public Course() {

  }

  public Course(long id, String name, String author) {

    this.id = id;
    this.name = name;
    this.author = author;
  }

  // getters
  public long getId() {

    return id;
  }

  public String getName() {

    return name;
  }

  public String getAuthor() {

    return author;
  }

  // toString
  @Override
  public String toString() {

    return "Course{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", author='" + author + '\'' +
        '}';
  }
}
