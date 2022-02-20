package com.opticsolutions.courseApi.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;

    public List<Course> getCourses(){
        List<Course> courses = new ArrayList<>();
        courseRepository.findAll().forEach(courses::add);
        return courses;
    }

    public Optional<Course> getCourseById(String id){
        return courseRepository.findById(id);
    }

    public Course addCourse(Course course){
        courseRepository.save(course);
        return course;
    }

    public Course updateCourse(Course course){
        courseRepository.save(course);
        return course;
    }

    public String deleteCourseById(String id){
        courseRepository.deleteById(id);
        return "Success removed course with id : " + id;
    }
}
