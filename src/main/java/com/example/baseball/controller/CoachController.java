package com.example.baseball.controller;

import com.example.baseball.dto.CoachDTO;
import com.example.baseball.entity.Coach;
import com.example.baseball.service.CoachService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/coaches")
@RequiredArgsConstructor
public class CoachController {
  private final CoachService coachService;

  @PostMapping
  public ResponseEntity<Coach> createCoach(@RequestBody CoachDTO dto) {
    return ResponseEntity.ok(coachService.createCoach(dto));
  }

  @PutMapping("/{id}")
  public ResponseEntity<Coach> updateCoach(@PathVariable Long id, @RequestBody CoachDTO dto) {
    return ResponseEntity.ok(coachService.updateCoach(id, dto));
  }

  @GetMapping("/{id}")
  public ResponseEntity<Coach> getCoach(@PathVariable Long id) {
    return ResponseEntity.ok(coachService.getCoach(id));
  }

  @GetMapping
  public ResponseEntity<List<Coach>> getAllCoaches() {
    return ResponseEntity.ok(coachService.getAllCoaches());
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteCoach(@PathVariable Long id) {
    coachService.deleteCoach(id);
    return ResponseEntity.noContent().build();
  }
}
