package com.example.springkafka.dto;

import java.util.List;

public class AppUserDto {

    private String topicName;
    private List<Object> listDto;
    private int countDto;

    public AppUserDto() {
    }

    public AppUserDto(String topicName, int countDto) {
        this.topicName = topicName;
        this.countDto = countDto;
        for(int i = 0; i<countDto; i++){
            listDto.add(new AppUserDto());
        }
    }

    public String getTopicName() {
        return topicName;
    }

    public List<Object> getListDto() {
        return listDto;
    }
}
