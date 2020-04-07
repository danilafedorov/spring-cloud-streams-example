package com.fedorov.example.rabbit.consumer.stream;

import com.fedorov.example.rabbit.common.dto.EventDto;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Streams {

    @Input(EventDto.TOPIC)
    SubscribableChannel getEvent();
}
