package ru.digitalleague.spacex.service;

import org.springframework.stereotype.Service;
import ru.digitalleague.spacex.domain.Rocket;
import ru.digitalleague.spacex.repository.RocketRepository;
import ru.digitalleague.spacex.service.dto.RocketDto;
import ru.digitalleague.spacex.service.dto.RocketWithStatusDto;
import ru.digitalleague.spacex.service.mappers.RocketMapper;

import java.util.Optional;

@Service
public class RocketService {

    private RocketRepository rocketRepository;
    private RocketMapper rocketMapper;

    public RocketService(RocketRepository rocketRepository, RocketMapper rocketMapper) {
        this.rocketRepository = rocketRepository;
        this.rocketMapper = rocketMapper;
    }

    public Rocket addRocket(RocketDto rocketDto) {
        Rocket savedRocket = rocketRepository.save(rocketMapper.toEntity(rocketDto));
        return savedRocket;
    }

    public RocketWithStatusDto changeStatus(String status, Integer id) {
        Optional<Rocket> rocketOptional = rocketRepository.findById(id);
        Rocket rocket = rocketOptional.get();
        rocket.setStatus(status);
        rocketRepository.save(rocket);
        return rocketMapper.toDtoWithStatus(rocket);
    }

}
