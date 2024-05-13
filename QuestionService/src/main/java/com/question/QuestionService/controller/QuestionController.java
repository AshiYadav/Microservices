package com.question.QuestionService.controller;

import com.question.QuestionService.entity.Question;
import com.question.QuestionService.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping
    public ResponseEntity getAllQuestion(){
        return ResponseEntity.ok(questionService.getAllQuestion());
    }

    @GetMapping("/{id}")
    public ResponseEntity getQuestionBasedOnID(@PathVariable("id") int id){
        return ResponseEntity.ok(questionService.getQuestionBasedOnID(id));
    }

    @PostMapping
    public  ResponseEntity createQuestion(@RequestBody Question question){
        System.out.println("Inside");
        return ResponseEntity.ok(questionService.createQuestion(question));
    }

    @GetMapping("/quiz/{id}")
    public ResponseEntity getQuestionBasedOnQuizId(@PathVariable("id") int id){
        return  ResponseEntity.ok(questionService.getQuestionBasedOnQuizId(id));
    }
}
