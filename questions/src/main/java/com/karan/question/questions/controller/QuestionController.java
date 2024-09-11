package com.karan.question.questions.controller;


import com.karan.question.questions.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private ConfigurableEnvironment env;


    @GetMapping("/")
    public ResponseEntity<String> home() {
        StringBuilder builder = new StringBuilder("This is question service");
        builder.append("___________________________________________");

        for (PropertySource<?> propertySource : env.getPropertySources()) {
            if (propertySource instanceof MapPropertySource mapPropertySource) {
                for (String key : mapPropertySource.getPropertyNames()) {
                    builder.append(key).append(" = ").append(env.getProperty(key));
                    builder.append("___________________________________________");

                    builder.append(System.lineSeparator());

                }
            }
        }

        return ResponseEntity.ok(builder.toString());
    }


}
