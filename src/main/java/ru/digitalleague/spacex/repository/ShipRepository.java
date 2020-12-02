package ru.digitalleague.spacex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.digitalleague.spacex.domain.Ship;

public interface ShipRepository extends JpaRepository<Ship, Integer> {
}
