package com.river.backend.controller;

import com.river.backend.model.AnswerModel;
import com.river.backend.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/answers")
public class AnswerController {
    @Autowired
    AnswerService answerService;

    @GetMapping(value = "/user/{username}")
    ResponseEntity<List<AnswerModel>> getAnswersByUsername(@PathVariable(name = "username") String username){
        return answerService.getAnswersByUsername(username);
    }

    @GetMapping(value = "/question/{questionId}")
    ResponseEntity<List<AnswerModel>> getAnswersByUsername(@PathVariable(name = "questionId") Long questionId){
        return answerService.getAnswersByQuestionId(questionId);
    }



    @PostMapping(value = "/")
    ResponseEntity<Boolean> postAnswer(@RequestBody AnswerModel answerModel){
    return answerService.postAnswer(answerModel);
    }
}
