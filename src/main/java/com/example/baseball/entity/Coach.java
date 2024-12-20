package com.example.baseball.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Coach {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long coachId;

  private String name;
  private int experienceYears;

  @ManyToOne
  @JoinColumn(name = "department_id")
  private Department department;
}
