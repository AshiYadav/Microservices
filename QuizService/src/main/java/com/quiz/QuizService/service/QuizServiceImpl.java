package com.quiz.QuizService.service;

import com.quiz.QuizService.entity.Quiz;
import com.quiz.QuizService.exception.QuizNotFoundException;
import com.quiz.QuizService.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("QuizService")
public class QuizServiceImpl implements QuizService{

    @Autowired
    private QuizRepository quizRepository;
    @Autowired
    private  QuizClient quizClient;

    @Override
    public List<Quiz> getAllQuiz() {

        List<Quiz> quizList = quizRepository.findAll();
        List<Quiz> quizWithQuestion= quizList.stream().map(quiz ->{
             quiz.setQuestions(quizClient.getAllQuestionBasedOnQuiz(quiz.getId()));
             return quiz;
        }).collect(Collectors.toList());
        return quizWithQuestion;
    }

    @Override
    public Quiz getQuizBasedOnID(int id) {
        Quiz quiz =  quizRepository.findById(id).orElseThrow(() ->{
            return new QuizNotFoundException("Quiz not found exception");
        });

        quiz.setQuestions(quizClient.getAllQuestionBasedOnQuiz(quiz.getId()));
        return quiz;
    }

    @Override
    public Quiz createQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }


}
