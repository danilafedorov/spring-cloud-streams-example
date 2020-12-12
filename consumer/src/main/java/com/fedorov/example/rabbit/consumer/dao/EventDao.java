package com.fedorov.example.rabbit.consumer.dao;

import com.fedorov.example.rabbit.consumer.dao.mapper.EventMapper;
import com.fedorov.example.rabbit.consumer.model.Event;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class EventDao {

    private final EventMapper eventMapper;

    public void save(Event event) {
        eventMapper.save(event);
    }
}
