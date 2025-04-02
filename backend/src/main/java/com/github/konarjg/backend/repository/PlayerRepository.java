package com.github.konarjg.backend.repository;

import com.github.konarjg.backend.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
