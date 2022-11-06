package com.example.springkafka.dto;

import java.util.Calendar;
import java.util.Date;

public class AppUserDto {

    private String name;
    private Date date;

    public AppUserDto() {
        this.name = "IRobot";
        this.date = Calendar.getInstance().getTime();
    }
}
