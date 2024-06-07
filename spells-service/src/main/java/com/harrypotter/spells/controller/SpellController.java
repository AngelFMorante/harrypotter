package com.harrypotter.spells.controller;

import com.harrypotter.spells.entity.Spell;
import com.harrypotter.spells.service.SpellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spells")
public class SpellController {

    @Autowired
    private SpellService spellService;

    @GetMapping
    public List<Spell> getAllSpells() {
        return spellService.findAll();
    }

    @PostMapping
    public Spell createSpell(@RequestBody Spell spell) {
        return spellService.save(spell);
    }

    @GetMapping("/{id}")
    public Spell getSpellById(@PathVariable Long id) {
        return spellService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteSpell(@PathVariable Long id) {
        spellService.deleteById(id);
    }
}
