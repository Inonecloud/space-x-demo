package ru.digitalleague.spacex.service.mappers;

import org.springframework.stereotype.Service;
import ru.digitalleague.spacex.domain.Rocket;
import ru.digitalleague.spacex.service.dto.RocketDto;
import ru.digitalleague.spacex.service.dto.RocketWithStatusDto;

import java.util.ArrayList;

@Service
public class RocketMapper {

    public Rocket toEntity(RocketDto dto){
        Rocket entity = new Rocket();
        entity.setModel(dto.getModel());
        entity.setStatus("IN_PROGRESS");
        entity.setLaunches(new ArrayList<>());
        return entity;
    }

    public RocketDto toDto(Rocket entity){
        return new RocketDto(entity.getModel());
    }

    public RocketWithStatusDto toDtoWithStatus(Rocket rocket){
        return new RocketWithStatusDto(rocket.getModel(), rocket.getStatus());
    }
}
