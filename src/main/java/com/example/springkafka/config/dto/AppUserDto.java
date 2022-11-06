package com.example.springkafka.config.dto;

public class AppUserDto {

    private String name;

    public AppUserDto() {
    }

    public AppUserDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
