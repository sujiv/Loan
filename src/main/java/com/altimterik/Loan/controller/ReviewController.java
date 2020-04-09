package com.altimterik.Loan.controller;

import ch.qos.logback.core.pattern.parser.OptionTokenizer;
import com.altimterik.Loan.models.*;
import com.altimterik.Loan.repository.ApplicationDetailsRepo;
import com.altimterik.Loan.repository.UserInputRepository;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/review")
public class ReviewController {

    List<String> fields = new ArrayList<>();
    List<String> sources = new ArrayList<>();
    {
        fields.add("FTE employees for  12 months prior to loan date");
        fields.add("Employee Wages");
        fields.add("Less employee/owner wages in excess of 100K");
        fields.add("Less qualified sick leave wages covered under FFCRA");
        fields.add("Less qualified family leave wages covered under FFCRA");
        fields.add("Group health care benefits - insurance premiums");
        fields.add("Payment of retirement benefit");
        fields.add("Payment of employer payroll taxes - State & local");
        fields.add("Contract labor ");
        fields.add("Less individual contract labor in excess of 100K");
        fields.add("Prior 12 months cumulative qualifying payroll cost");
        fields.add("Average monthly payroll costs");
        fields.add("x 2.5");
        fields.add("EDIL obtained from January 31, 2020 to be refinanced under program");
        fields.add("PPP Loan amount, lesser of calculation or $10 million");

        sources.add("IRS 941");
        sources.add("");
        sources.add("IRS 941");
        sources.add("ADP Monthly Payroll Cost Report");
        sources.add("");
        sources.add("");
        sources.add("ADP Monthly Payroll Cost Report");
        sources.add("ADP Monthly Payroll Cost Report");
        sources.add("ADP Monthly Payroll Cost Report");
        sources.add("");
        sources.add("");
        sources.add("Calculate / ADP Monthly Payroll Cost Report");
        sources.add("Calculate / ADP Monthly Payroll Cost Report");
        sources.add("Calculate");
        sources.add("API");
        sources.add("Calculate");

    }

    @Autowired
    UserInputRepository userInputRepository;

    @Autowired
    ApplicationDetailsRepo applicationDetailsRepo;

    @GetMapping("/load")
    public String loadInitial(){
        return "loaded";
    }

    @GetMapping(value = "", produces = "application/json")
    public List<ListItem> getList(){
        List listItems = new ArrayList();
        for(UserInputs ui: userInputRepository.findAll()){
            ListItem li = new ListItem();
            li.userInputId = ui.userInputId;
            li.legalName = ui.legalName;
            li.TIN_EIN_SIN = ui.TIN;
            li.accounts = ui.accounts;
            li.irs941Uploaded = ui.irs941Uploaded?"Yes":"No";
            li.grossPayrollUploaded = ui.grossPayrollUploaded?"Yes":"No";
            li.healthcareCostsUploaded = ui.healthcareCostsUploaded?"Yes":"No";
            li.status = ui.status;
            listItems.add(li);
        }
        return listItems;
    }

    @GetMapping(value = "/{uid}", produces = "application/json")
    public UserApplicationDetails getDetails(@PathVariable(value = "uid", required = true) Integer uid){
        UserApplicationDetails ud = new UserApplicationDetails();
        Optional<UserInputs> userInputData = userInputRepository.findById(uid);
        Optional<ApplicationDetails> applicationDetails = applicationDetailsRepo.findByUserInputId(uid);
        System.out.println("uid: "+uid);
        if(userInputData.isPresent()){
            UserInputs ui = userInputData.get();
            ud.userInputId = ui.userInputId;
            ud.legalName = ui.legalName;
            ud.primaryContact = ui.primaryContact;
            ud.businessPhone = ui.businessPhone;
            ud.TIN_EIN_SIN = ui.TIN;
            ud.accounts = ui.accounts;
            ud.email = ui.email;
            ud.tradeName = ui.tradeName;
            if(applicationDetails.isPresent()){
                ApplicationDetails ad = applicationDetails.get();
                try {
                    JSONObject autoVerified = new JSONObject("{\"FTE_Emp12MnthsPrior\":\"N\",\"empWages\":\"N\",\"lessOwnerWagesExcess100K\":\"N\",\"lessQualifiedSickLeaveWagesUnderFFCRA\":\"N\",\"lessQualifiedFamilyLeaveWagesUnderFFCRA\":\"N\",\"groupHealthCareBenefitsInsPremium\":\"N\",\"paymentRetirementBen\":\"N\",\"paymentEmployerPayrollTaxesStateLocal\":\"N\",\"contractLabor\":\"N\",\"lessIndividualContractLaborExcess100K\":\"N\",\"prior12MnthsCumQualifyingPayrollCost\":\"N\",\"avgMonthlyPayrollcosts\":\"N\",\"multiplier2dot5\":\"N\",\"EDIL_ObtainedFrmJan31ToBeRefinanced\":\"N\",\"PPP_LoadAmntLesserOfCalcOr10Mil\":\"N\"}");
                    if(ad.fieldAutoVerified!=null)
                        autoVerified  = new JSONObject(ad.fieldAutoVerified);
                    JSONObject comments = new JSONObject("{\"FTE_Emp12MnthsPrior\":\"N\",\"empWages\":\"N\",\"lessOwnerWagesExcess100K\":\"N\",\"lessQualifiedSickLeaveWagesUnderFFCRA\":\"N\",\"lessQualifiedFamilyLeaveWagesUnderFFCRA\":\"N\",\"groupHealthCareBenefitsInsPremium\":\"N\",\"paymentRetirementBen\":\"N\",\"paymentEmployerPayrollTaxesStateLocal\":\"N\",\"contractLabor\":\"N\",\"lessIndividualContractLaborExcess100K\":\"N\",\"prior12MnthsCumQualifyingPayrollCost\":\"N\",\"avgMonthlyPayrollcosts\":\"comment1\",\"multiplier2dot5\":\"comment1\",\"EDIL_ObtainedFrmJan31ToBeRefinanced\":\"comment1\",\"PPP_LoadAmntLesserOfCalcOr10Mil\":\"comment1\"}");
                    if(ad.fieldComments!=null)
                        comments = new JSONObject(ad.fieldComments);
                    ud.FTE_Emp12MnthsPrior = createJson(fields.get(0),sources.get(0),1.0*ad.FTE_Emp12MnthsPrior,autoVerified.getString("FTE_Emp12MnthsPrior"),comments.get("FTE_Emp12MnthsPrior"));
                    ud.empWages = createJson(fields.get(1),sources.get(1),ad.empWages,autoVerified.getString("empWages"),comments.get("empWages"));
                    ud.lessOwnerWagesExcess100K = createJson(fields.get(2),sources.get(2),ad.lessOwnerWagesExcess100K,autoVerified.getString("lessOwnerWagesExcess100K"),comments.get("lessOwnerWagesExcess100K"));
                    ud.lessQualifiedSickLeaveWagesUnderFFCRA = createJson(fields.get(3),sources.get(3),ad.lessQualifiedSickLeaveWagesUnderFFCRA,autoVerified.getString("lessQualifiedSickLeaveWagesUnderFFCRA"),comments.get("lessQualifiedSickLeaveWagesUnderFFCRA"));
                    ud.lessQualifiedFamilyLeaveWagesUnderFFCRA = createJson(fields.get(4),sources.get(4),ad.lessQualifiedFamilyLeaveWagesUnderFFCRA,autoVerified.getString("lessQualifiedFamilyLeaveWagesUnderFFCRA"),comments.get("lessQualifiedFamilyLeaveWagesUnderFFCRA"));
                    ud.groupHealthCareBenefitsInsPremium = createJson(fields.get(5),sources.get(5),ad.groupHealthCareBenefitsInsPremium,autoVerified.getString("groupHealthCareBenefitsInsPremium"),comments.get("groupHealthCareBenefitsInsPremium"));
                    ud.paymentRetirementBen = createJson(fields.get(6),sources.get(6),ad.paymentRetirementBen,autoVerified.getString("paymentRetirementBen"),comments.get("paymentRetirementBen"));
                    ud.paymentEmployerPayrollTaxesStateLocal = createJson(fields.get(7),sources.get(7),ad.paymentEmployerPayrollTaxesStateLocal,autoVerified.getString("paymentEmployerPayrollTaxesStateLocal"),comments.get("paymentEmployerPayrollTaxesStateLocal"));
                    ud.contractLabor = createJson(fields.get(8),sources.get(8),ad.contractLabor,autoVerified.getString("contractLabor"),comments.get("contractLabor"));
                    ud.lessIndividualContractLaborExcess100K = createJson(fields.get(9),sources.get(9),ad.lessIndividualContractLaborExcess100K,autoVerified.getString("lessIndividualContractLaborExcess100K"),comments.get("lessIndividualContractLaborExcess100K"));
                    ud.prior12MnthsCumQualifyingPayrollCost = createJson(fields.get(10),sources.get(10),ad.prior12MnthsCumQualifyingPayrollCost,autoVerified.getString("prior12MnthsCumQualifyingPayrollCost"),comments.get("prior12MnthsCumQualifyingPayrollCost"));
                    ud.avgMonthlyPayrollcosts = createJson(fields.get(11),sources.get(11),ad.avgMonthlyPayrollcosts,autoVerified.getString("avgMonthlyPayrollcosts"),comments.get("avgMonthlyPayrollcosts"));
                    ud.multiplier2dot5 = createJson(fields.get(12),sources.get(12),ad.multiplier2dot5,autoVerified.getString("multiplier2dot5"),comments.get("multiplier2dot5"));
                    ud.EDIL_ObtainedFrmJan31ToBeRefinanced = createJson(fields.get(13),sources.get(13),ad.EDIL_ObtainedFrmJan31ToBeRefinanced,autoVerified.getString("EDIL_ObtainedFrmJan31ToBeRefinanced"),comments.get("EDIL_ObtainedFrmJan31ToBeRefinanced"));
                    ud.PPP_LoadAmntLesserOfCalcOr10Mil = createJson(fields.get(14),sources.get(14),ad.PPP_LoadAmntLesserOfCalcOr10Mil,autoVerified.getString("PPP_LoadAmntLesserOfCalcOr10Mil"),comments.get("PPP_LoadAmntLesserOfCalcOr10Mil"));
                    ud.applicationComments = ad.applicationComments;
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
            else{
                ud.FTE_Emp12MnthsPrior = createJson(fields.get(0),sources.get(0),null,"","");
                ud.empWages = createJson(fields.get(1),sources.get(1),null,"","");
                ud.lessOwnerWagesExcess100K = createJson(fields.get(2),sources.get(2),null,"","");
                ud.lessQualifiedSickLeaveWagesUnderFFCRA = createJson(fields.get(3),sources.get(3),null,"","");
                ud.lessQualifiedFamilyLeaveWagesUnderFFCRA = createJson(fields.get(4),sources.get(4),null,"","");
                ud.groupHealthCareBenefitsInsPremium = createJson(fields.get(5),sources.get(5),null,"","");
                ud.paymentRetirementBen = createJson(fields.get(6),sources.get(6),null,"","");
                ud.paymentEmployerPayrollTaxesStateLocal = createJson(fields.get(7),sources.get(7),null,"","");
                ud.contractLabor = createJson(fields.get(8),sources.get(8),null,"","");
                ud.lessIndividualContractLaborExcess100K = createJson(fields.get(9),sources.get(9),null,"","");
                ud.prior12MnthsCumQualifyingPayrollCost = createJson(fields.get(10),sources.get(10),null,"","");
                ud.avgMonthlyPayrollcosts = createJson(fields.get(11),sources.get(11),null,"","");
                ud.multiplier2dot5 = createJson(fields.get(12),sources.get(12),null,"","");
                ud.EDIL_ObtainedFrmJan31ToBeRefinanced = createJson(fields.get(13),sources.get(13),null,"","");
                ud.PPP_LoadAmntLesserOfCalcOr10Mil = createJson(fields.get(14),sources.get(14),null,"","");
                ud.applicationComments = "";
            }
        }
        System.out.println(ud);
        return ud;
    }

    private RowItem createJson(String fieldName, String source, Double amount, String autoVerified, Object comment) {
        RowItem rowItem = new RowItem();
        rowItem.fieldName = fieldName;
        rowItem.amount = amount;
        rowItem.source = source;
        rowItem.autoVerified = autoVerified;
        rowItem.comments = (String)comment;
        System.out.println(rowItem);
        return rowItem;
    }

    @PostMapping(value = "/{uid}")
    public String getDetails(@PathVariable(value = "uid", required = true) Integer uid
            , @RequestParam(value="command", required = false) String command
            , @RequestParam(value="comment", required = false) String comment
            ){
        System.out.println("Post Request received: command =>"+command+" comment:"+comment);
        Optional<UserInputs> oui = userInputRepository.findById(uid);
        Optional<ApplicationDetails> oad = applicationDetailsRepo.findByUserInputId(uid);
        if(!oui.isPresent()){
//            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("The record does not exist in database");
            return "The record does not exist in database";
        }
        if(!oad.isPresent()){
            return "The record is not pre-processed yet.";
        }
        ApplicationDetails ad = oad.get();
        if(comment!=null && !comment.isEmpty()){
            ad.setApplicationComments(comment +" |"+ad.getApplicationComments());
        }
        UserInputs ui = oui.get();
        ui.setStatus(command);
//        switch(command){
//            case "approve":{
//                ui.setStatus(command);
//                break;
//            }
//            case "addInfo":{
//
//                break;
//            }
//            case "deny":{
//
//                break;
//            }
//            case "comment":{
//
//                break;
//            }
//            default:{
//                System.out.println(command+" unknown command");
//            }
//        }
        applicationDetailsRepo.save(ad);
        userInputRepository.save(ui);
        return "{success:'Successfully reviewed application "+uid+"'}";
    }

}
