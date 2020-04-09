package com.altimterik.Loan.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.ToString;
import org.json.JSONObject;

@JsonIgnoreProperties(ignoreUnknown=true)
@ToString
public class UserApplicationDetails {
    public Integer	userInputId;
    public String	legalName;
    public String	primaryContact;
    public String	businessPhone;
    public String	TIN_EIN_SIN;
    public String	accounts;
    public String	email;
    public String	tradeName;
    public RowItem   FTE_Emp12MnthsPrior;
    public RowItem	empWages;
    public RowItem	lessOwnerWagesExcess100K;
    public RowItem	lessQualifiedSickLeaveWagesUnderFFCRA;
    public RowItem	lessQualifiedFamilyLeaveWagesUnderFFCRA;
    public RowItem	groupHealthCareBenefitsInsPremium;
    public RowItem	paymentRetirementBen;
    public RowItem	paymentEmployerPayrollTaxesStateLocal;
    public RowItem	contractLabor;
    public RowItem	lessIndividualContractLaborExcess100K;
    public RowItem	prior12MnthsCumQualifyingPayrollCost;
    public RowItem	avgMonthlyPayrollcosts;
    public RowItem	multiplier2dot5;
    public RowItem	EDIL_ObtainedFrmJan31ToBeRefinanced;
    public RowItem	PPP_LoadAmntLesserOfCalcOr10Mil;
    public String	applicationComments;
    public Boolean	processedFlag;
    public String	processStatus;
}
