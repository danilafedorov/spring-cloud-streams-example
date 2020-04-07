package com.fedorov.example.rabbit.consumer.converter;

import com.fedorov.example.rabbit.common.dto.EventDto;
import com.fedorov.example.rabbit.consumer.model.Event;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class EventConverter implements Converter<EventDto, Event> {
    @Override
    public Event convert(EventDto eventDto) {
        Event event = new Event();
        event.setNumber(eventDto.getNumber());
        event.setText(eventDto.getText());
        event.setTimeStamp(eventDto.getTimeStamp());
        return event;
    }
}
