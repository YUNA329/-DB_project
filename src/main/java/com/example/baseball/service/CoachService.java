package com.example.baseball.service;

import com.example.baseball.dto.CoachDTO;
import com.example.baseball.entity.Coach;
import com.example.baseball.entity.Department;
import com.example.baseball.repository.CoachRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CoachService {
  private final CoachRepository coachRepository;

  public Coach createCoach(CoachDTO dto) {
    Coach coach = new Coach();
    coach.setName(dto.getName());
    coach.setExperienceYears(dto.getExperienceYears());
    coach.setDepartment(new Department(dto.getDepartmentId()));
    return coachRepository.save(coach);
  }

  public Coach updateCoach(Long id, CoachDTO dto) {
    Coach coach = coachRepository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Coach not found"));
    coach.setName(dto.getName());
    coach.setExperienceYears(dto.getExperienceYears());
    coach.setDepartment(new Department(dto.getDepartmentId()));
    return coachRepository.save(coach);
  }

  public Coach getCoach(Long id) {
    return coachRepository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Coach not found"));
  }

  public List<Coach> getAllCoaches() {
    return coachRepository.findAll();
  }

  public void deleteCoach(Long id) {
    coachRepository.deleteById(id);
  }
}
