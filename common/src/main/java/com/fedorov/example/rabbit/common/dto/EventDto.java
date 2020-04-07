package com.fedorov.example.rabbit.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EventDto {

    public static final String TOPIC = "event";

    /**
     * some number (unique)
     */
    private String number;
    /**
     * Some text
     */
    private String text;

    private Long timeStamp;
}
