package com.example.baseball.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Grade {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long gradeId;

  @Column(nullable = false)
  private String gradeName;

  public Grade(Long gradeId) {
    this.gradeId = gradeId;
  }
}
