package com.river.backend.dao;

import com.river.backend.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserModelDao extends JpaRepository<UserModel, String> {
}
