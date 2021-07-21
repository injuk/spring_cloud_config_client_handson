package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IngnohController {

  @Value("${hello.ingnoh}")
  private String ingnoh;

  @GetMapping("")
  public String hello() {
    return ingnoh;
  }
}
