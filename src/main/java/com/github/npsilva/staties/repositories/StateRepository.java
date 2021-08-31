package com.github.npsilva.staties.repositories;

import com.github.npsilva.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
