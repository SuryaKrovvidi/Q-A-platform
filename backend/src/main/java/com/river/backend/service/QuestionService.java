package com.river.backend.service;

import com.river.backend.dao.QuestionModelDao;
import com.river.backend.dao.UserModelDao;
import com.river.backend.model.QuestionModel;
import com.river.backend.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionModelDao questionModelDao;

    @Autowired
    UserModelDao userModelDao;

    public ResponseEntity<Boolean> addQuestion(QuestionModel questionModel){
        UserModel userModel = userModelDao.getById(questionModel.getAuthorId());       // CHECK IF VALID USERNAME
        userModel.getQuestions().add(questionModel);

        userModelDao.save(userModel);
        System.out.println(questionModel.toString());
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

    public ResponseEntity<List<QuestionModel>> getQuestions(String username){
        UserModel currentUser = userModelDao.findById(username).get();
        List<QuestionModel> questions = currentUser.getQuestions();
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }

    public ResponseEntity<List<QuestionModel>> getAllQuestions(){
        List<QuestionModel> questions = questionModelDao.findAll();
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }


}
