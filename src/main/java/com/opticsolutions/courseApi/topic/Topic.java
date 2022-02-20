package com.opticsolutions.courseApi.topic;

import com.opticsolutions.courseApi.course.Course;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Topic {
    @Id
    String id;
    String name;
    String description;

    @ManyToOne
    Course course;

    public Topic(String id, String name, String description, String courseId) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.course = new Course(courseId, "" , "");
    }
}
