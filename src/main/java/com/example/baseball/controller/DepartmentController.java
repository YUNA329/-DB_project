package com.example.baseball.controller;

import com.example.baseball.entity.Department;
import com.example.baseball.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
@RequiredArgsConstructor
public class DepartmentController {
  private final DepartmentService departmentService;

  @GetMapping
  public ResponseEntity<List<Department>> getAllDepartments() {
    return ResponseEntity.ok(departmentService.getAllDepartments());
  }
}
