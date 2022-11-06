package com.example.springkafka.service;


import com.example.springkafka.dto.AppUserDto;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SendService {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public SendService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(AppUserDto dto) {
        kafkaTemplate.send("server.topic1", dto);
    }

    public void produce(AppUserDto dto) {
        kafkaTemplate.send("test", dto);
    }
}
