package com.opticsolutions.courseApi.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {
    @Autowired
    TopicRepository topicRepository;

    public List<Topic> getCourses(String id){
        return new ArrayList<>(topicRepository.findByCourseId(id));
    }

    public Optional<Topic> getCourseById(String id){
        return topicRepository.findById(id);
    }

    public Topic addCourse(Topic topic){
        topicRepository.save(topic);
        return topic;
    }

    public Topic updateCourse(Topic topic){
        topicRepository.save(topic);
        return topic;
    }

    public String deleteCourseById(String id){
        topicRepository.deleteById(id);
        return "Success removed course with id : " + id;
    }
}
