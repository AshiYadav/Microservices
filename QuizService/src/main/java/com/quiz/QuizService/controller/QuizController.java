package com.quiz.QuizService.controller;

import com.quiz.QuizService.entity.Quiz;
import com.quiz.QuizService.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
//    @Qualifier("QuizService")
    private QuizService quizService;

    @GetMapping
    public ResponseEntity getAllQuiz(){
        return ResponseEntity.ok(quizService.getAllQuiz());
    }

    @GetMapping("/{id}")
    public ResponseEntity getQuizBasedOnID(@PathVariable("id") int id){
        return ResponseEntity.ok(quizService.getQuizBasedOnID(id));
    }

    @PostMapping
    public  ResponseEntity createQuiz(@RequestBody Quiz quiz){
        System.out.println("Inside");
        return ResponseEntity.ok(quizService.createQuiz(quiz));
    }
}
