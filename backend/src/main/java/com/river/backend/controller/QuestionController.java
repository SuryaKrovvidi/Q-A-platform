package com.river.backend.controller;

import com.river.backend.model.QuestionModel;
import com.river.backend.model.UserModel;
import com.river.backend.service.QuestionService;
import com.river.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/questions")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping(value = "/")
    ResponseEntity<List<QuestionModel>> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping(value = "/{username}")
    ResponseEntity<List<QuestionModel>> getQuestions(@PathVariable(name = "username") String username){
        return questionService.getQuestions(username);
    }

    @PostMapping(value = "/")
    ResponseEntity<Boolean> addQuestion(@RequestBody QuestionModel questionModel){
        System.out.println(questionModel.toString());
        return questionService.addQuestion(questionModel);
    }


}
