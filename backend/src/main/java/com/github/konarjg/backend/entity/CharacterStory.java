package com.github.konarjg.backend.entity;

import jakarta.persistence.*;

@Entity(name = "CharacterStories")
public class CharacterStory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long characterStoryId;
    @Column(name = "story", nullable = false)
    private String story;

    public long getCharacterStoryId() {
        return characterStoryId;
    }

    public void setCharacterStoryId(long characterStoryId) {
        this.characterStoryId = characterStoryId;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }
}
