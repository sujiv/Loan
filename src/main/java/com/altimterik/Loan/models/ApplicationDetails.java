package com.altimterik.Loan.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="application_details")
public class ApplicationDetails {
    @Id
    @GeneratedValue
    public Integer id;
    public Integer userInputId;
    public Integer FTE_Emp12MnthsPrior;
    public Double empWages;
    public Double lessOwnerWagesExcess100K;
    public Double lessQualifiedSickLeaveWagesUnderFFCRA;
    public Double lessQualifiedFamilyLeaveWagesUnderFFCRA;
    public Double groupHealthCareBenefitsInsPremium;
    public Double paymentRetirementBen;
    public Double paymentEmployerPayrollTaxesStateLocal;
    public Double contractLabor;
    public Double lessIndividualContractLaborExcess100K;
    public Double prior12MnthsCumQualifyingPayrollCost;
    public Double avgMonthlyPayrollcosts;
    public Double multiplier2dot5;
    public Double EDIL_ObtainedFrmJan31ToBeRefinanced;
    public Double PPP_LoadAmntLesserOfCalcOr10Mil;
    public String fieldComments;
    public String fieldAutoVerified;
    public String applicationComments;
    public Boolean processedFlag;
    public String processStatus;
//    @Basic(optional = false)
//    @Column(name = "createdTs", insertable = false, updatable = false)
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name="created_ts", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable=false, updatable=false)
//    public Date createdTs;
}
