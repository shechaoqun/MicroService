package com.microservice.trainning.repository;

import com.microservice.trainning.model.Event;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by chaoqunshe on 4/27/17.
 */
public interface EventRepository extends MongoRepository<Event,String> {
    List<Event> findByName(@Param("name") String name);
    List<Event> findByNumberLimit(@Param("numberLimit") Integer numberLimit);

}
