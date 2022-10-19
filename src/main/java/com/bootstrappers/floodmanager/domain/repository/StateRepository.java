package com.bootstrappers.floodmanager.domain.repository;

import com.bootstrappers.floodmanager.domain.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {

    Optional<State> findByTitle(String title);

}
