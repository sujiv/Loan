package com.altimterik.Loan.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListItem {
//    public	Integer	userInputId;
//    public	String	legalName;
//    public	String	TIN_EIN_SIN;
//    public	String	accounts;
//    public	Boolean	irs941Uploaded;
//    public	Boolean	healthcareCostsUploaded;
//    public	Boolean	grossPayrollUploaded;
//    public	String	status;
    public	Integer	userInputId;
    @JsonProperty("name")
    public	String	legalName;
    @JsonProperty("tin")
    public	String	TIN_EIN_SIN;
    @JsonProperty("account")
    public	String	accounts;
    @JsonProperty("irs941")
    public	String	irs941Uploaded;
    @JsonProperty("healthcareCostReport")
    public	String	healthcareCostsUploaded;
    @JsonProperty("payrollCostReport")
    public	String	grossPayrollUploaded;
    @JsonProperty("payrollHeadcountReport")
    public String HeadCount;
    @JsonProperty("status")
    public	String	status;
}
