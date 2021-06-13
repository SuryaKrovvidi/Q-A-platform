package com.river.backend.controller;

import com.river.backend.model.QuestionModel;
import com.river.backend.model.UserModel;
import com.river.backend.service.QuestionService;
import com.river.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/questions")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @PostMapping(value = "/{username}")
    ResponseEntity<Boolean> addQuestion(@RequestBody QuestionModel questionModel, @PathVariable(name = "username") String username){
        System.out.println(questionModel.getDescription());
        return questionService.addQuestion(questionModel, username);
    }
}
