package com.harrypotter.witches.controller;

import com.harrypotter.witches.entity.Witch;
import com.harrypotter.witches.service.WitchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/witches")
public class WitchController {

    @Autowired
    private WitchService witchService;

    @GetMapping
    public List<Witch> getAllWitches() {
        return witchService.findAll();
    }

    @PostMapping
    public Witch createWitch(@RequestBody Witch witch) {
        return witchService.save(witch);
    }

    @GetMapping("/{id}")
    public Witch getWitchById(@PathVariable Long id) {
        return witchService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteWitch(@PathVariable Long id) {
        witchService.deleteById(id);
    }
}
