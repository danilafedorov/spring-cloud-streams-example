package com.fedorov.example.rabbit.producer.service;

import com.fedorov.example.rabbit.common.dto.EventDto;
import com.fedorov.example.rabbit.producer.stream.Streams;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Slf4j
@Service
@RequiredArgsConstructor
public class Publisher {

    private final Streams streams;

    @Scheduled(fixedDelay = 1000)
    public void sendEvent() {

        long offset = RandomUtils.nextLong(1000, 10000);
        boolean isNegative = RandomUtils.nextBoolean();
        offset = isNegative ? offset * -1 : offset;
        EventDto eventDto = new EventDto("123",
                RandomStringUtils.random(10, true, false),
                Instant.now().toEpochMilli() - offset);

        streams.event().send(MessageBuilder.withPayload(eventDto).build());

        log.info("Send object: {}", eventDto);
    }
}
