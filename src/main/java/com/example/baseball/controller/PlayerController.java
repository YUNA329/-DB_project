package com.example.baseball.controller;

import com.example.baseball.dto.PlayerDTO;
import com.example.baseball.entity.Player;
import com.example.baseball.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/players")
@RequiredArgsConstructor
public class PlayerController {
  private final PlayerService playerService;

  @PostMapping
  public ResponseEntity<Player> createPlayer(@RequestBody PlayerDTO dto) {
    return ResponseEntity.ok(playerService.createPlayer(dto));
  }

  @PutMapping("/{id}")
  public ResponseEntity<Player> updatePlayer(@PathVariable Long id, @RequestBody PlayerDTO dto) {
    return ResponseEntity.ok(playerService.updatePlayer(id, dto));
  }

  @GetMapping("/{id}")
  public ResponseEntity<Player> getPlayer(@PathVariable Long id) {
    return ResponseEntity.ok(playerService.getPlayer(id));
  }

  @GetMapping
  public ResponseEntity<List<Player>> getAllPlayers() {
    return ResponseEntity.ok(playerService.getAllPlayers());
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deletePlayer(@PathVariable Long id) {
    playerService.deletePlayer(id);
    return ResponseEntity.noContent().build();
  }
}
