package com.opticsolutions.courseApi.course;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;


    @PostMapping("/courses")
    @ApiOperation(value="add a course to the databases", notes="add Course")
    public Course addCourse(@RequestBody Course course)
    {
        return courseService.addCourse(course);
    }


    @PutMapping("/courses")
    @ApiOperation(value="Edit Course", notes="Edit a course in db", response=Course.class)
    Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }


    @GetMapping("/courses")
    @ApiOperation(value="get Courses", notes="get all courses from db")
    List<Course> getAllCourses(){
        return courseService.getCourses();
    }

    @GetMapping("/courses/{id}")
    @ApiOperation(value="get Course ", notes="Get course by id from db")
    Optional<Course> getCourseById(@ApiParam(value="Id of the course to search", required=true) @PathVariable String id){
        return courseService.getCourseById(id);
    }

    @DeleteMapping("/courses/{id}")
    @ApiOperation(value="delete Course", notes="delete a course with specified id", response=String.class)
    String deleteCourseById(@PathVariable String id){
        return courseService.deleteCourseById(id);
    }



}
