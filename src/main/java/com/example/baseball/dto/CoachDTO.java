package com.example.baseball.dto;

import lombok.Data;

@Data
public class CoachDTO {
  private Long id;
  private String name;
  private int experienceYears;
  private Long departmentId;
}
