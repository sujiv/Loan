package com.altimterik.Loan.models;

import javax.persistence.*;


@Entity
@Table(name="scanned_image")

public class ScannedImage {
    @Id
    @GeneratedValue
    Long blobID;

    public ScannedImage() {
    }

    public ScannedImage(byte[] irs941, byte[] healthcareCosts, byte[] grossPayroll) {
        this.irs941 = irs941;
        this.healthcareCosts = healthcareCosts;
        this.grossPayroll = grossPayroll;
    }

    @Lob
    @Column(name = "irs941")
    private byte[] irs941;

    public void setBlobID(Long blobID) {
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

    @Lob
    @Column(name = "healthcare_costs")
    private byte[] healthcareCosts;

    @Lob
    @Column(name = "gross_payroll")
    private byte[] grossPayroll;

    public Long getBlobID() {
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
}
