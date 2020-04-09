package com.altimterik.Loan.repository;

import com.altimterik.Loan.models.UserInputData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInputRepo extends JpaRepository<UserInputData, Integer> {
}
