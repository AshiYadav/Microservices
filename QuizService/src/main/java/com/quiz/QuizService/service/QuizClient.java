package com.quiz.QuizService.service;

import com.quiz.QuizService.entity.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "QUESTION-SERVICE")
public interface QuizClient {

    @GetMapping("/question/quiz/{id}")
    List<Question> getAllQuestionBasedOnQuiz(@PathVariable("id") int id);
}
