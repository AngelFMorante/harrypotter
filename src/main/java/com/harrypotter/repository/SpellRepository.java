package com.harrypotter.repository;

import com.harrypotter.entity.Spell;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpellRepository extends JpaRepository<Spell, Long> {
}

