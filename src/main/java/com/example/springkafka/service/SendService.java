package com.example.springkafka.service;


import com.example.springkafka.config.dto.AppUserDto;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SendService {

    private final KafkaTemplate<Long, AppUserDto> kafkaStarshipTemplate;

    public SendService(KafkaTemplate<Long, AppUserDto> kafkaStarshipTemplate) {
        this.kafkaStarshipTemplate = kafkaStarshipTemplate;
    }

    public void send(AppUserDto dto) {
        kafkaStarshipTemplate.send("server.topic1", dto);
    }

    public void produce() {
        AppUserDto dto = new AppUserDto("TestMsg");
        kafkaStarshipTemplate.send("test", dto);
    }
}
