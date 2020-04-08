package com.altimterik.Loan.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name="application_details")
public class LoanBasicData {


    @Id
    @GeneratedValue
    Long Id;
    String  legalName ;
    String primaryContact;
    String businessPhone;
    String TIN_EIN_SIN;
    String accounts;
    String email ;
    String FTE_Emp12MnthsPrior;
    String  empWages;
    String  lessOwnerWagesExcess100K;
    String lessQualifiedSickLeaveWagesUnderFFCRA;
    String  lessQualifiedFamilyLeaveWagesUnderFFCRA;
    String groupHealthCareBenefitsInsPremium;
    String paymentRetirementBen;
    String paymentEmployerPayrollTaxesStateLocal;
    String  contractLabor;
    String lessIndividualContractLaborExcess100K;
    String  prior12MnthsCumQualifyingPayrollCost;
    String  avgMonthlyPayrollcosts;
    String  multiplier2dot5;
    String EDIL_ObtainedFrmJan31ToBeRefinanced;
    String PPP_LoadAmntLesserOfCalcOr10Mil;
    String  fieldComments;
    String  fieldAutoVerified;
    String applicationComments;
    Long blobID;


    /////////////// new feilds =======================
    String additionalInformation;
    int numberOfJobs;
    String bussinessTradeName;
//    =======================?

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public void setNumberOfJobs(int numberOfJobs) {
        this.numberOfJobs = numberOfJobs;
    }

    public void setBussinessTradeName(String bussinessTradeName) {
        this.bussinessTradeName = bussinessTradeName;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public int getNumberOfJobs() {
        return numberOfJobs;
    }

    public String getBussinessTradeName() {
        return bussinessTradeName;
    }




    public void setId(Long id) {
        Id = id;
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
        this.TIN_EIN_SIN = TIN_EIN_SIN;
    }

    public void setAccounts(String accounts) {
        this.accounts = accounts;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFTE_Emp12MnthsPrior(String FTE_Emp12MnthsPrior) {
        this.FTE_Emp12MnthsPrior = FTE_Emp12MnthsPrior;
    }

    public void setEmpWages(String empWages) {
        this.empWages = empWages;
    }

    public void setLessOwnerWagesExcess100K(String lessOwnerWagesExcess100K) {
        this.lessOwnerWagesExcess100K = lessOwnerWagesExcess100K;
    }

    public void setLessQualifiedSickLeaveWagesUnderFFCRA(String lessQualifiedSickLeaveWagesUnderFFCRA) {
        this.lessQualifiedSickLeaveWagesUnderFFCRA = lessQualifiedSickLeaveWagesUnderFFCRA;
    }

    public void setLessQualifiedFamilyLeaveWagesUnderFFCRA(String lessQualifiedFamilyLeaveWagesUnderFFCRA) {
        this.lessQualifiedFamilyLeaveWagesUnderFFCRA = lessQualifiedFamilyLeaveWagesUnderFFCRA;
    }

    public void setGroupHealthCareBenefitsInsPremium(String groupHealthCareBenefitsInsPremium) {
        this.groupHealthCareBenefitsInsPremium = groupHealthCareBenefitsInsPremium;
    }

    public void setPaymentRetirementBen(String paymentRetirementBen) {
        this.paymentRetirementBen = paymentRetirementBen;
    }

    public void setPaymentEmployerPayrollTaxesStateLocal(String paymentEmployerPayrollTaxesStateLocal) {
        this.paymentEmployerPayrollTaxesStateLocal = paymentEmployerPayrollTaxesStateLocal;
    }

    public void setContractLabor(String contractLabor) {
        this.contractLabor = contractLabor;
    }

    public void setLessIndividualContractLaborExcess100K(String lessIndividualContractLaborExcess100K) {
        this.lessIndividualContractLaborExcess100K = lessIndividualContractLaborExcess100K;
    }

    public void setPrior12MnthsCumQualifyingPayrollCost(String prior12MnthsCumQualifyingPayrollCost) {
        this.prior12MnthsCumQualifyingPayrollCost = prior12MnthsCumQualifyingPayrollCost;
    }

    public void setAvgMonthlyPayrollcosts(String avgMonthlyPayrollcosts) {
        this.avgMonthlyPayrollcosts = avgMonthlyPayrollcosts;
    }

    public void setMultiplier2dot5(String multiplier2dot5) {
        this.multiplier2dot5 = multiplier2dot5;
    }

    public void setEDIL_ObtainedFrmJan31ToBeRefinanced(String EDIL_ObtainedFrmJan31ToBeRefinanced) {
        this.EDIL_ObtainedFrmJan31ToBeRefinanced = EDIL_ObtainedFrmJan31ToBeRefinanced;
    }

    public void setPPP_LoadAmntLesserOfCalcOr10Mil(String PPP_LoadAmntLesserOfCalcOr10Mil) {
        this.PPP_LoadAmntLesserOfCalcOr10Mil = PPP_LoadAmntLesserOfCalcOr10Mil;
    }

    public void setFieldComments(String fieldComments) {
        this.fieldComments = fieldComments;
    }

    public void setFieldAutoVerified(String fieldAutoVerified) {
        this.fieldAutoVerified = fieldAutoVerified;
    }

    public void setApplicationComments(String applicationComments) {
        this.applicationComments = applicationComments;
    }



    public void setCreatedTs(LocalDateTime createdTs) {
        this.createdTs = createdTs;
    }



    public Long getId() {
        return Id;
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
        return TIN_EIN_SIN;
    }

    public String getAccounts() {
        return accounts;
    }

    public String getEmail() {
        return email;
    }

    public String getFTE_Emp12MnthsPrior() {
        return FTE_Emp12MnthsPrior;
    }

    public String getEmpWages() {
        return empWages;
    }

    public String getLessOwnerWagesExcess100K() {
        return lessOwnerWagesExcess100K;
    }

    public String getLessQualifiedSickLeaveWagesUnderFFCRA() {
        return lessQualifiedSickLeaveWagesUnderFFCRA;
    }

    public String getLessQualifiedFamilyLeaveWagesUnderFFCRA() {
        return lessQualifiedFamilyLeaveWagesUnderFFCRA;
    }

    public String getGroupHealthCareBenefitsInsPremium() {
        return groupHealthCareBenefitsInsPremium;
    }

    public String getPaymentRetirementBen() {
        return paymentRetirementBen;
    }

    public String getPaymentEmployerPayrollTaxesStateLocal() {
        return paymentEmployerPayrollTaxesStateLocal;
    }

    public String getContractLabor() {
        return contractLabor;
    }

    public String getLessIndividualContractLaborExcess100K() {
        return lessIndividualContractLaborExcess100K;
    }

    public String getPrior12MnthsCumQualifyingPayrollCost() {
        return prior12MnthsCumQualifyingPayrollCost;
    }

    public String getAvgMonthlyPayrollcosts() {
        return avgMonthlyPayrollcosts;
    }

    public String getMultiplier2dot5() {
        return multiplier2dot5;
    }

    public String getEDIL_ObtainedFrmJan31ToBeRefinanced() {
        return EDIL_ObtainedFrmJan31ToBeRefinanced;
    }

    public String getPPP_LoadAmntLesserOfCalcOr10Mil() {
        return PPP_LoadAmntLesserOfCalcOr10Mil;
    }

    public String getFieldComments() {
        return fieldComments;
    }

    public String getFieldAutoVerified() {
        return fieldAutoVerified;
    }

    public String getApplicationComments() {
        return applicationComments;
    }



    public LocalDateTime getCreatedTs() {
        return createdTs;
    }

    public LoanBasicData() {
    }

    @Override
    public String toString() {
        return "LoanBasicData{" +
                "Id=" + Id +
                ", legalName='" + legalName + '\'' +
                ", primaryContact='" + primaryContact + '\'' +
                ", businessPhone='" + businessPhone + '\'' +
                ", TIN_EIN_SIN='" + TIN_EIN_SIN + '\'' +
                ", accounts='" + accounts + '\'' +
                ", email='" + email + '\'' +
                ", FTE_Emp12MnthsPrior='" + FTE_Emp12MnthsPrior + '\'' +
                ", empWages='" + empWages + '\'' +
                ", lessOwnerWagesExcess100K='" + lessOwnerWagesExcess100K + '\'' +
                ", lessQualifiedSickLeaveWagesUnderFFCRA='" + lessQualifiedSickLeaveWagesUnderFFCRA + '\'' +
                ", lessQualifiedFamilyLeaveWagesUnderFFCRA='" + lessQualifiedFamilyLeaveWagesUnderFFCRA + '\'' +
                ", groupHealthCareBenefitsInsPremium='" + groupHealthCareBenefitsInsPremium + '\'' +
                ", paymentRetirementBen='" + paymentRetirementBen + '\'' +
                ", paymentEmployerPayrollTaxesStateLocal='" + paymentEmployerPayrollTaxesStateLocal + '\'' +
                ", contractLabor='" + contractLabor + '\'' +
                ", lessIndividualContractLaborExcess100K='" + lessIndividualContractLaborExcess100K + '\'' +
                ", prior12MnthsCumQualifyingPayrollCost='" + prior12MnthsCumQualifyingPayrollCost + '\'' +
                ", avgMonthlyPayrollcosts='" + avgMonthlyPayrollcosts + '\'' +
                ", multiplier2dot5='" + multiplier2dot5 + '\'' +
                ", EDIL_ObtainedFrmJan31ToBeRefinanced='" + EDIL_ObtainedFrmJan31ToBeRefinanced + '\'' +
                ", PPP_LoadAmntLesserOfCalcOr10Mil='" + PPP_LoadAmntLesserOfCalcOr10Mil + '\'' +
                ", fieldComments='" + fieldComments + '\'' +
                ", fieldAutoVerified='" + fieldAutoVerified + '\'' +
                ", applicationComments='" + applicationComments + '\'' +
                ", blobID=" + blobID +
                ", additionalInformation='" + additionalInformation + '\'' +
                ", numberOfJobs=" + numberOfJobs +
                ", bussinessTradeName='" + bussinessTradeName + '\'' +
                ", createdTs=" + createdTs +
                '}';
    }

    public Long getBlobID() {
        return blobID;
    }

    @CreationTimestamp
    private LocalDateTime createdTs;

    public void setBlobID(Long blobID) {
        this.blobID = blobID;
    }
}
