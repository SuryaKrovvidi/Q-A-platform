package com.river.backend.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class AnswerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    private Long questionId;

    private String authorId;

    public AnswerModel(Long id, String content, Long questionId, String authorId) {
        this.id = id;
        this.content = content;
        this.questionId = questionId;
        this.authorId = authorId;
    }

    public AnswerModel(String content, Long questionId, String authorId) {
        this.content = content;
        this.questionId = questionId;
        this.authorId = authorId;
    }

    public AnswerModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }
}
