package com.example.springkafka.service;

import com.example.springkafka.dto.AppUserDto;
import com.example.springkafka.dto.RecordData;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SendService {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    static private String topic;
    List<AppUserDto> appUserDtoList = new ArrayList<>();
    public SendService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void generationDto(RecordData recordData){
        int count = recordData.size();
        topic = recordData.topic();
        for(int i = 0; i<count; i++){
            appUserDtoList.add(new AppUserDto());
        }
    }

    public void produce() {
        kafkaTemplate.send(topic, appUserDtoList);
    }
}
