package com.example.baseball.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Player {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long playerId;

  private String name;
  private String position;
  private String birthDate;

  @ManyToOne
  @JoinColumn(name = "grade_id")
  private Grade grade;

  @ManyToOne
  @JoinColumn(name = "department_id")
  private Department department;
}
