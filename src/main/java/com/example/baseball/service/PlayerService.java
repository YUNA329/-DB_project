package com.example.baseball.service;

import com.example.baseball.dto.PlayerDTO;
import com.example.baseball.entity.Department;
import com.example.baseball.entity.Grade;
import com.example.baseball.entity.Player;
import com.example.baseball.repository.PlayerRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerService {
  private final PlayerRepository playerRepository;

  public Player createPlayer(PlayerDTO dto) {
    Player player = new Player();
    player.setName(dto.getName());
    player.setPosition(dto.getPosition());
    player.setBirthDate(dto.getBirthDate());
    player.setGrade(new Grade(dto.getGradeId()));
    player.setDepartment(new Department(dto.getDepartmentId()));
    return playerRepository.save(player);
  }

  public Player updatePlayer(Long id, PlayerDTO dto) {
    Player player = playerRepository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Player not found"));
    player.setName(dto.getName());
    player.setPosition(dto.getPosition());
    player.setBirthDate(dto.getBirthDate());
    player.setGrade(new Grade(dto.getGradeId()));
    player.setDepartment(new Department(dto.getDepartmentId()));
    return playerRepository.save(player);
  }

  public Player getPlayer(Long id) {
    return playerRepository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Player not found"));
  }

  public List<Player> getAllPlayers() {
    return playerRepository.findAll();
  }

  public void deletePlayer(Long id) {
    playerRepository.deleteById(id);
  }
}
