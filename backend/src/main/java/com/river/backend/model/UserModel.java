package com.river.backend.model;

import javax.persistence.*;


@Entity
public class UserModel {

    @Id
    String username;
    String name;
    String password;
    String rollNumber;
    String branch;

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
