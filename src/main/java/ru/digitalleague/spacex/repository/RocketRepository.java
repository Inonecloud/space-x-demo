package ru.digitalleague.spacex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.digitalleague.spacex.domain.Launch;
import ru.digitalleague.spacex.domain.Rocket;

import java.util.Optional;

public interface RocketRepository extends JpaRepository<Rocket, Integer> {

    Rocket findByStatus(String status);
}
