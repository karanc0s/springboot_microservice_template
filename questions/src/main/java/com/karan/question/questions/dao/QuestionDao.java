package com.karan.question.questions.dao;

import com.karan.question.questions.model.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao  extends JpaRepository<QuestionEntity , Integer> {

}
