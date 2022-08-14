package com.user.validate.user.repository;

import com.user.validate.user.model.TransferType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferTypeRepository extends JpaRepository<TransferType, String> { }
