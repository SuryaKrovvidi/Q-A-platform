package com.river.backend.dao;

import com.river.backend.model.QuestionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionModelDao extends JpaRepository<QuestionModel, Long> {
}
