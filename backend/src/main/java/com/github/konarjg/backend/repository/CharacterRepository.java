package com.github.konarjg.backend.repository;

import com.github.konarjg.backend.entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {
}
