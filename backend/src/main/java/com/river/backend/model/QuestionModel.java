package com.river.backend.model;

import javax.persistence.*;
import java.util.Date;


@Entity
public class QuestionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "username")
    UserModel userModel;

    public QuestionModel() {
    }

    public QuestionModel(String description, UserModel userModel) {
        this.description = description;
        this.userModel = userModel;
    }

    public QuestionModel(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    @Override
    public String toString() {
        return "QuestionModel{" +
                "id=" + id +
                ", Description='" + description + '\'' +
                ", userModel=" + userModel +
                '}';
    }
}
