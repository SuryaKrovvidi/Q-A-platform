package com.river.backend.model;

import javax.persistence.*;
import java.util.List;


@Entity
public class UserModel {

    @Id
    private String username;
    private String name;
    private String password;
    private String rollNumber;
    private String branch;

    @OneToMany(mappedBy = "authorId", cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST,CascadeType.REFRESH})
    private List<QuestionModel> questions;

    @OneToMany(mappedBy = "authorId", cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST,CascadeType.REFRESH})
    private List<AnswerModel> answers;


    public UserModel(){}


    public UserModel(String name, String username, String password, String rollNumber, String branch) {
        this.name = name;
        this.password = password;
        this.rollNumber = rollNumber;
        this.branch = branch;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public List<QuestionModel> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionModel> questions) {
        this.questions = questions;
    }

    public List<AnswerModel> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AnswerModel> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
