package com.opticsolutions.courseApi.topic;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
public interface TopicRepository extends CrudRepository<Topic, String> {
    List<Topic> findByCourseId(String id);
}
