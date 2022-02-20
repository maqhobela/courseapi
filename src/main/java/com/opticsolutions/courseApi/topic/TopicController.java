package com.opticsolutions.courseApi.topic;
import com.opticsolutions.courseApi.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {
    @Autowired
    TopicService topicService;

    @PostMapping("/courses/{couseId}/topics")
    public Topic addTopic(@RequestBody Topic topic, @PathVariable String couseId)
    {
        topic.setCourse( new Course(couseId,"", ""));
        return topicService.addCourse(topic);
    }

    @PutMapping("/courses/{couseId}/topics")
    Topic updateCourse(@RequestBody Topic topic, @PathVariable String couseId){
        topic.setCourse( new Course(couseId,"", ""));
        return topicService.updateCourse(topic);
    }

    @GetMapping("/courses/{courseId}/topics")
    List<Topic> getAllTopics(@PathVariable String courseId){
        return topicService.getCourses(courseId);
    }

    @GetMapping("/courses/{courseId}/topics/{topicId}")
    Optional<Topic> getCourseByTopicId(@PathVariable String topicId){
        return topicService.getCourseById(topicId);
    }

    @DeleteMapping("/courses/{courseId}/topics/{topicId}")
    String deleteTopicById(@PathVariable String topicId){
        return topicService.deleteCourseById(topicId);
    }



}
