package com.example.baseball.dto;

import com.example.baseball.entity.Department;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DepartmentDTO {
  private Long departmentId;    // 부서 ID
  private String departmentName; // 부서 이름
  private String function;      // 부서 기능

  public DepartmentDTO(Department department) {
    this.departmentId = department.getDepartmentId();
    this.departmentName = department.getDepartmentName();
    this.function = department.getFunction();
  }
}
