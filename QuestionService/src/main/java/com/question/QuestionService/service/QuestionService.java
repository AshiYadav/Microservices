package com.question.QuestionService.service;

import com.question.QuestionService.entity.Question;

import java.util.List;

public interface QuestionService {

    public List<Question> getAllQuestion();
    public Question getQuestionBasedOnID(int id);
    public Question createQuestion(Question quiz);

    public List<Question> getQuestionBasedOnQuizId(int id);
}
