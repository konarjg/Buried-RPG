package com.github.konarjg.backend.entity;

import jakarta.persistence.*;

@Entity(name = "CharacterSkills")
public class CharacterSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long characterSkillId;
    @Column(name = "name", unique = true, nullable = false)
    private String name;
    @Column(name = "rank", nullable = true)
    private int rank;

    public long getCharacterSkillId() {
        return characterSkillId;
    }

    public void setCharacterSkillId(long characterSkillId) {
        this.characterSkillId = characterSkillId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
