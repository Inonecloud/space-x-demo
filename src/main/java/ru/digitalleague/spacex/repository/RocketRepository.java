package ru.digitalleague.spacex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.digitalleague.spacex.domain.Rocket;

public interface RocketRepository extends JpaRepository<Rocket, Integer> {
}
