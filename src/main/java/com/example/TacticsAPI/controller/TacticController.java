package com.example.TacticsAPI.controller;

import com.example.TacticsAPI.model.Tactic;
import com.example.TacticsAPI.service.TacticService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tactics")

public class TacticController {
    private final TacticService service;

    public TacticController(TacticService service) {
        this.service = service;
    }

    @GetMapping
    public List<Tactic> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Tactic getOne(@PathVariable Long id) {
        return service.getTactic(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Tactic updateTactic(@PathVariable Long id, @RequestBody Tactic tactic) {
        tactic.setId(id);
        return service.save(tactic);
    }

    @PostMapping
    public Tactic addTactic(@RequestBody Tactic tactic) {
        return service.save(tactic);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteTactic(id);
    }
}
