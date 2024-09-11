package com.karan.quiz.quiz.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Data
@Entity
@Table(name = "quiz")
public class QuizEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer quizId;

    private String quizTitle;

    @ElementCollection
    private List<Integer> questionIds;

}
