package com.example.baseball.controller;

import com.example.baseball.entity.Grade;
import com.example.baseball.service.GradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/grades")
@RequiredArgsConstructor
public class GradeController {
  private final GradeService gradeService;

  @GetMapping
  public ResponseEntity<List<Grade>> getAllGrades() {
    return ResponseEntity.ok(gradeService.getAllGrades());
  }
}
