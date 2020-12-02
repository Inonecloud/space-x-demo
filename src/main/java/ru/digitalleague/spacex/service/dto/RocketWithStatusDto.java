package ru.digitalleague.spacex.service.dto;

public class RocketWithStatusDto extends RocketDto {
    private String status;

    public RocketWithStatusDto(){
    }

    public RocketWithStatusDto(String model, String status){
        super.setModel(model);
        this.status = status;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
