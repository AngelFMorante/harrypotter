package com.harrypotter.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class Witch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;

    @OneToMany(mappedBy = "witch", cascade = CascadeType.ALL)
    private List<Spell> spells;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Spell> getSpells() {
        return spells;
    }

    public void setSpells(List<Spell> spells) {
        this.spells = spells;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Witch witch = (Witch) o;
        return age == witch.age && Objects.equals(id, witch.id) && Objects.equals(name, witch.name) && Objects.equals(spells, witch.spells);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, spells);
    }

    @Override
    public String toString() {
        return "Witch{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", spells=" + spells +
                '}';
    }
}
