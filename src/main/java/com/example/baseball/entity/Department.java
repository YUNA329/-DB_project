package com.example.baseball.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Department {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long departmentId;

  @Column(nullable = false)
  private String departmentName;

  private String function;

  public Department(Long departmentId) {
    this.departmentId = departmentId;
  }
}
