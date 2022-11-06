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

    public SendService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void generationDto(RecordData recordData){
        List<AppUserDto> appUserDtoList = new ArrayList<>(recordData.size());
        for(int i = 0; i<recordData.size(); i++){
            appUserDtoList.add(new AppUserDto());
        }
        kafkaTemplate.send(recordData.topic(), appUserDtoList);
    }
}
