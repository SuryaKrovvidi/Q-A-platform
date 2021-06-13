package com.river.backend.model;

import javax.persistence.*;
import java.util.Date;


@Entity
public class QuestionModel {

    //ID, authorId, description

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

//    @ManyToOne (cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST,CascadeType.REFRESH})
//    @JoinColumn(name = "username")
//    UserModel userModel;
    private String authorId;

    public QuestionModel(String description, String authorId) {
        this.description = description;
        this.authorId = authorId;
    }

    public QuestionModel() {
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

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }
}
