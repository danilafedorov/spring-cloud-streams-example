package com.fedorov.example.rabbit.consumer.service;

import com.fedorov.example.rabbit.common.dto.EventDto;
import com.fedorov.example.rabbit.consumer.dao.EventDao;
import com.fedorov.example.rabbit.consumer.model.Event;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class EventService {
    private final EventDao eventDao;
    private final ConversionService mvcConversionService;

    @StreamListener(EventDto.TOPIC)
    public void handle(EventDto eventDto) {
        Event event = mvcConversionService.convert(eventDto, Event.class);
        eventDao.save(event);
        log.info("Save entity {}", event);
    }
}
