package com.quiz.QuizService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz-test")
public class QuizTest {

    @GetMapping
    public ResponseEntity getall(){
        return ResponseEntity.ok(null);
    }
}
