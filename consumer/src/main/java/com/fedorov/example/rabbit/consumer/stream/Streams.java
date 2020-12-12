package com.fedorov.example.rabbit.consumer.stream;

import com.fedorov.example.rabbit.consumer.model.Chanel;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Streams {

    @Input(Chanel.EVENT)
    SubscribableChannel event();
}
