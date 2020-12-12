package com.fedorov.example.rabbit.producer.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface Streams {

    @Output
    MessageChannel event();
}
