package com.altimterik.Loan.repository;

import com.altimterik.Loan.models.ApplicationDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ApplicationDetailsRepo extends JpaRepository<ApplicationDetails, Integer> {
    public Optional<ApplicationDetails> findByUserInputId(Integer uid);
}
