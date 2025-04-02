package com.github.konarjg.backend.entity;

import jakarta.persistence.*;

@Entity(name = "ClassSkills")
public class ClassSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long classSkillId;
    @Column(name = "name", unique = true, nullable = false)
    private String name;
    @Column(name = "description", nullable = false)
    private String description;

    public long getClassSkillId() {
        return classSkillId;
    }

    public void setClassSkillId(long classSkillId) {
        this.classSkillId = classSkillId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
