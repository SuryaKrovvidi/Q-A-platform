package com.river.backend.service;

import com.river.backend.dao.QuestionModelDao;
import com.river.backend.dao.UserModelDao;
import com.river.backend.model.QuestionModel;
import com.river.backend.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
    @Autowired
    QuestionModelDao questionModelDao;

    @Autowired
    UserModelDao userModelDao;

    public ResponseEntity<Boolean> addQuestion(QuestionModel questionModel, String username){
        UserModel userModel = userModelDao.getById(username);       // CHECK IF VALID USERNAME
        questionModel.setUserModel(userModel);
        questionModelDao.save(questionModel);
        System.out.println(questionModel.toString());
        return new ResponseEntity<>(true, HttpStatus.OK);
    }
}
