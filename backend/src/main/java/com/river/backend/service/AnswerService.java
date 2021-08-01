package com.river.backend.service;

import com.river.backend.dao.AnswerModelDao;
import com.river.backend.dao.QuestionModelDao;
import com.river.backend.dao.UserModelDao;
import com.river.backend.model.AnswerModel;
import com.river.backend.model.QuestionModel;
import com.river.backend.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {
    @Autowired
    UserModelDao userModelDao;

    @Autowired
    QuestionModelDao questionModelDao;

    @Autowired
    AnswerModelDao answerModelDao;

    public ResponseEntity<Boolean> postAnswer(AnswerModel answerModel){
        UserModel user = userModelDao.findById(answerModel.getAuthorId()).get();
        QuestionModel question = questionModelDao.findById(answerModel.getQuestionId()).get();

        user.getAnswers().add(answerModel);
        question.getAnswers().add(answerModel);

        answerModelDao.save(answerModel);
        //userModelDao.save(user);
        //questionModelDao.save(question);

        return new ResponseEntity<Boolean>(true, HttpStatus.OK);
    }

    public ResponseEntity<List<AnswerModel>> getAnswersByUsername(String username){
        UserModel user = userModelDao.findById(username).get();
        return new ResponseEntity<List<AnswerModel>>(user.getAnswers(), HttpStatus.OK);
    }

    public ResponseEntity<List<AnswerModel>> getAnswersByQuestionId(Long questionId){
        QuestionModel user = questionModelDao.findById(questionId).get();
        return new ResponseEntity<List<AnswerModel>>(user.getAnswers(), HttpStatus.OK);
    }
}
