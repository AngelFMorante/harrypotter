package com.harrypotter.repository;

import com.harrypotter.entity.Witch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WitchRepository extends JpaRepository<Witch, Long> {
}
