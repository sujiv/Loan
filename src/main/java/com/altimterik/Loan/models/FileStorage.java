package com.altimterik.Loan.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
//@Table(name="FileStorage")
public class FileStorage {

    public void setUserInputId(Integer userInputId) {
        this.userInputId = userInputId;
    }

    @javax.persistence.Id
    @GeneratedValue
    Integer blobID;

    public Integer getUserInputId() {
        return userInputId;
    }

    Integer userInputId;

    @Lob
    @Column(name = "irs941")
    private byte[] irs941;

    @Lob
    @Column(name = "healthcareCosts")
    private byte[] healthcareCosts;

    @Lob
    @Column(name = "grossPayroll")
    private byte[] grossPayroll;

    @CreationTimestamp
    LocalDate createdTs;

    public FileStorage() {
    }

    public Integer getBlobID() {
        return blobID;
    }

    public byte[] getIrs941() {
        return irs941;
    }

    public byte[] getHealthcareCosts() {
        return healthcareCosts;
    }

    public byte[] getGrossPayroll() {
        return grossPayroll;
    }

    public LocalDate getCreatedTs() {
        return createdTs;
    }

    public void setBlobID(Integer blobID) {
        this.blobID = blobID;
    }

    public void setIrs941(byte[] irs941) {
        this.irs941 = irs941;
    }

    public void setHealthcareCosts(byte[] healthcareCosts) {
        this.healthcareCosts = healthcareCosts;
    }

    public void setGrossPayroll(byte[] grossPayroll) {
        this.grossPayroll = grossPayroll;
    }

    public void setCreatedTs(LocalDate createdTs) {
        this.createdTs = createdTs;
    }

}
