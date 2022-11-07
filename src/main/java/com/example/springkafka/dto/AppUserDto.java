package com.example.springkafka.dto;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class AppUserDto {

    private String name;
    private LocalDateTime date;

    public AppUserDto() {
        this.name = "IRobot";
        this.date = LocalDateTime.now();
    }
}
