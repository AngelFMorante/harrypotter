package com.harrypotter.witches.repository;

import com.harrypotter.witches.entity.Witch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WitchRepository extends JpaRepository<Witch, Long> {
}
