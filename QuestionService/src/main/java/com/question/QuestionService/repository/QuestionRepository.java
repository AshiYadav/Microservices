package com.question.QuestionService.repository;

import com.question.QuestionService.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Integer> {

    public List<Question> findByQuizId(int id);
}
