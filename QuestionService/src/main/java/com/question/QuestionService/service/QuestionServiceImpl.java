package com.question.QuestionService.service;

import com.question.QuestionService.entity.Question;
import com.question.QuestionService.exception.QuestionNotFoundException;
import com.question.QuestionService.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService{

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public List<Question> getAllQuestion() {
        return questionRepository.findAll();
    }

    @Override
    public Question getQuestionBasedOnID(int id) {
        return questionRepository.findById(id).orElseThrow(() ->{
            return new QuestionNotFoundException("Quiz not found exception");
        });
    }

    @Override
    public Question createQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> getQuestionBasedOnQuizId(int id) {
        return questionRepository.findByQuizId(id);
    }
}
