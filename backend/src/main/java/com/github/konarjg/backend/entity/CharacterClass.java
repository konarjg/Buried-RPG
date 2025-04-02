package com.github.konarjg.backend.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "CharacterClasses")
public class CharacterClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long characterClassId;
    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ClassSkill> classSkills;
}
