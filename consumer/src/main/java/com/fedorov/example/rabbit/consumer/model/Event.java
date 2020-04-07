package com.fedorov.example.rabbit.consumer.model;

import lombok.Data;

@Data
public class Event {
    private Long id;
    private String number;
    private String text;
    private Long timeStamp;
}
