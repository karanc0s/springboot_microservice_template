package com.karan.quiz.quiz.service;

import com.karan.quiz.quiz.dao.QuizDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizService {

    @Autowired
    private QuizDao quizDao;



}
