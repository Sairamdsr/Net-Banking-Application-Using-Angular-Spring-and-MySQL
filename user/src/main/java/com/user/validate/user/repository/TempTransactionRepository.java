package com.user.validate.user.repository;

import com.user.validate.user.model.TempTransactionDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TempTransactionRepository extends JpaRepository<TempTransactionDetails, Integer> { }
