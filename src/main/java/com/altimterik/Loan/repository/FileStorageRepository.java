package com.altimterik.Loan.repository;


import com.altimterik.Loan.models.FileStorage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FileStorageRepository  extends JpaRepository<FileStorage, Integer> {
}
