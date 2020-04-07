package com.fedorov.example.rabbit.consumer;

import com.fedorov.example.rabbit.consumer.stream.Streams;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(Streams.class)
@SpringBootApplication
public class AppConsumer {
    public static void main(String[] args) {
        SpringApplication.run(AppConsumer.class, args);
    }
}
