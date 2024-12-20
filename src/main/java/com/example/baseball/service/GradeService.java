package com.example.baseball.service;

import com.example.baseball.entity.Grade;
import com.example.baseball.repository.GradeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GradeService {
  private final GradeRepository gradeRepository;

  public List<Grade> getAllGrades() {
    return gradeRepository.findAll();
  }
}
