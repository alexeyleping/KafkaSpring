package com.example.springkafka.dto;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class AppUserDto {

    private String name;
    private Date date;

    public AppUserDto() {
        this.name = "IRobot";
        this.date = Calendar.getInstance().getTime();
    }
}
