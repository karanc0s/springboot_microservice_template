package com.karan.quiz.quiz.dao;

import com.karan.quiz.quiz.model.QuizEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface QuizDao extends JpaRepository<QuizEntity , Integer> {
}
