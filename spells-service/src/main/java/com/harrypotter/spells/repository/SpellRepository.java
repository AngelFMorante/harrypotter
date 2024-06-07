package com.harrypotter.spells.repository;

import com.harrypotter.spells.entity.Spell;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpellRepository extends JpaRepository<Spell, Long> {
}

