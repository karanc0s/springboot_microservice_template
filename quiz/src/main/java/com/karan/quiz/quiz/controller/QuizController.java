package com.karan.quiz.quiz.controller;


import com.karan.quiz.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("quiz")
public class QuizController {


    @Autowired
    private QuizService quizService;


    @GetMapping("/")
    public ResponseEntity<String> info(){
        return ResponseEntity.ok("this is quiz");
    }

}
