package com.quiz.QuizService.service;

import com.quiz.QuizService.entity.Quiz;

import java.util.List;

public interface QuizService {

    public List<Quiz> getAllQuiz();
    public Quiz getQuizBasedOnID(int id);
    public Quiz createQuiz(Quiz quiz);
}
