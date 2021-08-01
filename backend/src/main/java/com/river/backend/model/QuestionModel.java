package com.river.backend.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
public class QuestionModel {

    //ID, authorId, description

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;


    private String authorId;

    @OneToMany(mappedBy = "questionId", cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST,CascadeType.REFRESH})
    private List<AnswerModel> answers;

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

    public List<AnswerModel> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AnswerModel> answers) {
        this.answers = answers;
    }
}
