package com.fedorov.example.rabbit.producer;

import com.fedorov.example.rabbit.producer.stream.Streams;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(Streams.class)
@SpringBootApplication
public class AppProducer {
    public static void main(String[] args) {
        SpringApplication.run(AppProducer.class, args);
    }
}
