package com.example.baseball.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  // 홈 페이지 (index.html)
  @GetMapping("/")
  public String home() {
    return "index"; // templates/index.html 파일 반환
  }

  // 선수 관리 페이지 (players.html)
  @GetMapping("/players")
  public String players() {
    return "players"; // templates/players.html 파일 반환
  }


  // 코치 관리 페이지 (coaches.html)
  @GetMapping("/coaches")
  public String coaches() {
    return "coaches"; // templates/coaches.html 파일 반환
  }

}
