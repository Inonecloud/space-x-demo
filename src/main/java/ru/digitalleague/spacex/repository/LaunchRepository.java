package ru.digitalleague.spacex.repository;

import org.springframework.data.repository.CrudRepository;
import ru.digitalleague.spacex.domain.Launch;

import java.util.Optional;

public interface LaunchRepository extends CrudRepository<Launch, Integer> {

    Optional<Launch> findById(Integer id);
}
