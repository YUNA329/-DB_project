package com.example.baseball.dto;

import lombok.Data;

@Data
public class PlayerDTO {
  private Long id;
  private String name;
  private String position;
  private String birthDate;
  private Long gradeId;
  private Long departmentId;
}
