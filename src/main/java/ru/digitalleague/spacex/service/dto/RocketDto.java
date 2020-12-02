package ru.digitalleague.spacex.service.dto;

public class RocketDto {
    private String model;


    public RocketDto() {
    }

    public RocketDto(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
