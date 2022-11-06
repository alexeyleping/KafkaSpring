package com.example.springkafka.controller;

import com.example.springkafka.dto.RecordData;
import com.example.springkafka.service.SendService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/generator")
public class GeneratorController {
    private final SendService sendService;

    public GeneratorController(SendService sendService) {
        this.sendService = sendService;
    }

    @PostMapping
    public void createMsg(@RequestBody RecordData recordData){
        sendService.generationDto(recordData);
    }
}
