package com.river.backend.service;

import com.river.backend.dao.UserModelDao;
import com.river.backend.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserModelDao userModelDao;

    public ResponseEntity<Boolean> addUser(UserModel user){
        if(userModelDao.existsById(user.getUsername())){
            return new ResponseEntity<Boolean>(false, HttpStatus.OK);
        } else {
            userModelDao.save(user);
            return new ResponseEntity<Boolean>(true, HttpStatus.OK);
        }
    }
}
