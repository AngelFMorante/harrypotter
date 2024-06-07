package com.harrypotter.service;

import com.harrypotter.entity.Witch;
import com.harrypotter.repository.WitchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WitchService {

    @Autowired
    private WitchRepository witchRepository;

    public List<Witch> findAll() {
        return witchRepository.findAll();
    }

    public Witch save(Witch witch) {
        return witchRepository.save(witch);
    }

    public Witch findById(Long id) {
        return witchRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        witchRepository.deleteById(id);
    }
}

