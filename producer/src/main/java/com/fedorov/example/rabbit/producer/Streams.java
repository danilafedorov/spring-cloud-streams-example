package com.fedorov.example.rabbit.producer;

import com.fedorov.example.rabbit.common.dto.EventDto;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface Streams {

    @Output(EventDto.TOPIC)
    MessageChannel sendEvent();
}
