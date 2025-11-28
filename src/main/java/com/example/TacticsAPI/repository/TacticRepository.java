package com.example.TacticsAPI.repository;

import com.example.TacticsAPI.model.Tactic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacticRepository extends JpaRepository<Tactic, Long> {
    // Herda métodos prontos: findAll(), findById(), save(), deleteById()
}
