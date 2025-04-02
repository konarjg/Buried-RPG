package com.github.konarjg.backend.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Characters")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long characterId;
    @Column(name = "name", unique = true, nullable = false)
    private String name;
    @Column(name = "body", nullable = false)
    private int body;
    @Column(name = "mind", nullable = false)
    private int mind;
    @Column(name = "courage", nullable = false)
    private int courage;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true, optional = true)
    private CharacterStory story;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private CharacterClass characterClass;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CharacterSkill> skills;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ClassSkill> classSkills;

    public List<CharacterSkill> getSkills() {
        return skills;
    }

    public void setSkills(List<CharacterSkill> skills) {
        this.skills = skills;
    }

    public long getCharacterId() {
        return characterId;
    }

    public void setCharacterId(long characterId) {
        this.characterId = characterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public List<ClassSkill> getClassSkills() {
        return classSkills;
    }

    public void setClassSkills(List<ClassSkill> classSkills) {
        this.classSkills = classSkills;
    }

    public CharacterStory getStory() {
        return story;
    }

    public void setStory(CharacterStory story) {
        this.story = story;
    }
}
