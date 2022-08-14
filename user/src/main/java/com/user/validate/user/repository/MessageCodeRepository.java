package com.user.validate.user.repository;

import com.user.validate.user.model.MessageCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageCodeRepository extends JpaRepository<MessageCode, String> { }
