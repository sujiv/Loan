package com.altimterik.Loan.repository;

import com.altimterik.Loan.models.UserInputs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface  UserInputRepository  extends JpaRepository<UserInputs, Integer> {
}
