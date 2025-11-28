package com.example.TacticsAPI.service;

import com.example.TacticsAPI.model.Tactic;
import com.example.TacticsAPI.repository.TacticRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TacticService {
    private final TacticRepository repository;

    public TacticService(TacticRepository repository) {
        this.repository = repository;
    }

    public Optional<Tactic> getTactic(Long id) {
        return repository.findById(id);
    }

    public List<Tactic> getAll() {
        return repository.findAll();
    }

    public Tactic save(Tactic tactic) {
        return repository.save(tactic);
    }

    public void deleteTactic(Long id) {
        repository.deleteById(id);
    }
}
