package com.altimterik.Loan.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
//@Table(name="user_inputs")
public class UserInputs {

    @Id
    @GeneratedValue
    private Integer userInputId;
    String legalName;
    String primaryContact;
    String businessPhone;
    String TIN;
    String accounts;
    String email;
    boolean nonProfit;
    boolean vetOrg;
    boolean tribal;
    boolean indCont;
    boolean selfEmp;
    String tradeName;
    String businessEntityType;
    double avgMonthlyPayrollcosts;
    int numJobs;
    String addInfo;
    boolean eligibilityLine1;
    boolean eligibilityLine2;
    boolean eligibilityLine3;
    boolean eligibilityLine4;
    boolean eligibilityLine5;
    boolean eligibilityLine6;
    boolean certifyLine1;
    boolean certifyLine2;
    boolean certifyLine3;
    boolean certifyLine4;

    public void setUserInputId(Integer userInputId) {
        this.userInputId = userInputId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    boolean certifyLine5;

    public Integer getUserInputId() {
        return userInputId;
    }

    public String getStatus() {
        return status;
    }

    boolean certifyLine6;
    boolean certifyLine7;

    String signatureAuthRep;
    String signatureOwner;

    int blobID;
    boolean  irs941Uploaded;
    boolean healthcareCostsUploaded;
    boolean grossPayrollUploaded;
    @CreationTimestamp
    LocalDate createdTs;

    private String status;

    public UserInputs() {
    }


    public String getLegalName() {
        return legalName;
    }

    public String getPrimaryContact() {
        return primaryContact;
    }

    public String getBusinessPhone() {
        return businessPhone;
    }

    public String getTIN_EIN_SIN() {
        return TIN;
    }

    public String getAccounts() {
        return accounts;
    }

    public String getEmail() {
        return email;
    }

    public boolean isNonProfit() {
        return nonProfit;
    }

    public boolean isVetOrg() {
        return vetOrg;
    }

    public boolean isTribal() {
        return tribal;
    }

    public boolean isIndCont() {
        return indCont;
    }

    public boolean isSelfEmp() {
        return selfEmp;
    }

    public String getTradeName() {
        return tradeName;
    }

    public String getBusinessEntityType() {
        return businessEntityType;
    }

    public double getAvgMonthlyPayrollcosts() {
        return avgMonthlyPayrollcosts;
    }

    public int getNumJobs() {
        return numJobs;
    }

    public String getAddInfo() {
        return addInfo;
    }

    public boolean isEligibilityLine1() {
        return eligibilityLine1;
    }

    public boolean isEligibilityLine2() {
        return eligibilityLine2;
    }

    public boolean isEligibilityLine3() {
        return eligibilityLine3;
    }

    public boolean isEligibilityLine4() {
        return eligibilityLine4;
    }

    public boolean isEligibilityLine5() {
        return eligibilityLine5;
    }

    public boolean isEligibilityLine6() {
        return eligibilityLine6;
    }

    public boolean isCertifyLine1() {
        return certifyLine1;
    }

    public boolean isCertifyLine2() {
        return certifyLine2;
    }

    public boolean isCertifyLine3() {
        return certifyLine3;
    }

    public boolean isCertifyLine4() {
        return certifyLine4;
    }

    public boolean isCertifyLine5() {
        return certifyLine5;
    }

    public boolean isCertifyLine6() {
        return certifyLine6;
    }

    public boolean isCertifyLine7() {
        return certifyLine7;
    }



    public int getBlobID() {
        return blobID;
    }

    public boolean isIrs941Uploaded() {
        return irs941Uploaded;
    }

    public boolean isHealthcareCostsUploaded() {
        return healthcareCostsUploaded;
    }

    public boolean isGrossPayrollUploaded() {
        return grossPayrollUploaded;
    }




    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public void setPrimaryContact(String primaryContact) {
        this.primaryContact = primaryContact;
    }

    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }

    public void setTIN_EIN_SIN(String TIN_EIN_SIN) {
        this.TIN = TIN_EIN_SIN;
    }

    public void setAccounts(String accounts) {
        this.accounts = accounts;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNonProfit(boolean nonProfit) {
        this.nonProfit = nonProfit;
    }

    public void setVetOrg(boolean vetOrg) {
        this.vetOrg = vetOrg;
    }

    public void setTribal(boolean tribal) {
        this.tribal = tribal;
    }

    public void setIndCont(boolean indCont) {
        this.indCont = indCont;
    }

    public void setSelfEmp(boolean selfEmp) {
        this.selfEmp = selfEmp;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public void setBusinessEntityType(String businessEntityType) {
        this.businessEntityType = businessEntityType;
    }

    public void setAvgMonthlyPayrollcosts(double avgMonthlyPayrollcosts) {
        this.avgMonthlyPayrollcosts = avgMonthlyPayrollcosts;
    }

    public void setNumJobs(int numJobs) {
        this.numJobs = numJobs;
    }

    public void setAddInfo(String addInfo) {
        this.addInfo = addInfo;
    }

    public void setEligibilityLine1(boolean eligibilityLine1) {
        this.eligibilityLine1 = eligibilityLine1;
    }

    public void setEligibilityLine2(boolean eligibilityLine2) {
        this.eligibilityLine2 = eligibilityLine2;
    }

    public void setEligibilityLine3(boolean eligibilityLine3) {
        this.eligibilityLine3 = eligibilityLine3;
    }

    public void setEligibilityLine4(boolean eligibilityLine4) {
        this.eligibilityLine4 = eligibilityLine4;
    }

    public void setEligibilityLine5(boolean eligibilityLine5) {
        this.eligibilityLine5 = eligibilityLine5;
    }

    public void setEligibilityLine6(boolean eligibilityLine6) {
        this.eligibilityLine6 = eligibilityLine6;
    }

    public void setCertifyLine1(boolean certifyLine1) {
        this.certifyLine1 = certifyLine1;
    }

    public void setCertifyLine2(boolean certifyLine2) {
        this.certifyLine2 = certifyLine2;
    }

    public void setCertifyLine3(boolean certifyLine3) {
        this.certifyLine3 = certifyLine3;
    }

    public void setCertifyLine4(boolean certifyLine4) {
        this.certifyLine4 = certifyLine4;
    }

    public void setCertifyLine5(boolean certifyLine5) {
        this.certifyLine5 = certifyLine5;
    }

    public void setCertifyLine6(boolean certifyLine6) {
        this.certifyLine6 = certifyLine6;
    }

    public void setCertifyLine7(boolean certifyLine7) {
        this.certifyLine7 = certifyLine7;
    }



    public void setBlobID(int blobID) {
        this.blobID = blobID;
    }

    public void setIrs941Uploaded(boolean irs941Uploaded) {
        this.irs941Uploaded = irs941Uploaded;
    }

    public void setHealthcareCostsUploaded(boolean healthcareCostsUploaded) {
        this.healthcareCostsUploaded = healthcareCostsUploaded;
    }

    public void setGrossPayrollUploaded(boolean grossPayrollUploaded) {
        this.grossPayrollUploaded = grossPayrollUploaded;
    }

    public LocalDate getCreatedTs() {
        return createdTs;
    }

    public void setCreatedTs(LocalDate createdTs) {
        this.createdTs = createdTs;
    }

    public String getSignatureAuthRep() {
        return signatureAuthRep;
    }

    public String getSignatureOwner() {
        return signatureOwner;
    }

    public void setSignatureAuthRep(String signatureAuthRep) {
        this.signatureAuthRep = signatureAuthRep;
    }

    public void setSignatureOwner(String signatureOwner) {
        this.signatureOwner = signatureOwner;
    }
}
