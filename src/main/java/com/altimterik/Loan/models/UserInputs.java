package com.altimterik.Loan.models;

import lombok.Data;

import javax.persistence.*;
//import java.util.Date;

@Entity
@Table(name = "user_input")
@Data
public class UserInputs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer userInputId;
    public String legalName;
    public String primaryContact;
    public String businessPhone;
    public String TIN;
    public String accounts;
    public String email;
    public Boolean nonProfit;
    public Boolean vetOrg;
    public Boolean tribal;
    public Boolean indCont;
    public Boolean selfEmp;
    public String tradeName;
//    public Integer businessEntityType;

    public String businessEntityType;
    public Double avgMonthlyPayrollcosts;
    public Integer numJobs;
    public String addInfo;
    public Boolean eligibilityLine1;
    public Boolean eligibilityLine2;
    public Boolean eligibilityLine3;
    public Boolean eligibilityLine4;
    public Boolean eligibilityLine5;
    public Boolean eligibilityLine6;
    public Boolean certifyLine1;
    public Boolean certifyLine2;
    public Boolean certifyLine3;
    public Boolean certifyLine4;
    public Boolean certifyLine5;
    public Boolean certifyLine6;
    public Boolean certifyLine7;
    public String signatureAuthRep;
    public String signatureOwner;
    public Boolean irs941Uploaded;
    public Boolean healthcareCostsUploaded;
    public Boolean grossPayrollUploaded;
    public String status;
//    @Basic(optional = false)
//    @Column(name = "createdTs", insertable = false, updatable = false)
//    @Temporal(TemporalType.TIMESTAMP)
//    public Date createdTs;
}
