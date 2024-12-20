package com.example.baseball.dto;

import com.example.baseball.entity.Grade;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GradeDTO {
  private Long gradeId;    // 등급 ID
  private String gradeName; // 등급 이름

  public GradeDTO(Grade grade) {
    this.gradeId = grade.getGradeId();
    this.gradeName = grade.getGradeName();
  }
}
