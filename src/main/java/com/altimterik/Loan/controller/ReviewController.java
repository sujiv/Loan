package com.altimterik.Loan.controller;

import com.altimterik.Loan.models.ListItem;
import com.altimterik.Loan.models.UserInputData;
import com.altimterik.Loan.repository.ApplicationDetailsRepo;
import com.altimterik.Loan.repository.UserInputRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    UserInputRepo userInputRepo;

    @Autowired
    ApplicationDetailsRepo applicationDetailsRepo;

    @GetMapping("/load")
    public String loadInitial(){
        return "loaded";
    }

    @GetMapping("")
    public List<ListItem> getList(){
        List listItems = new ArrayList();
        for(UserInputData ui: userInputRepo.findAll()){
            ListItem li = new ListItem();
            li.userInputId = ui.userInputId;
            li.legalName = ui.legalName;
            li.TIN_EIN_SIN = ui.TIN_EIN_SIN;
            li.accounts = ui.accounts;
            li.irs941Uploaded = ui.irs941Uploaded;
            li.grossPayrollUploaded = ui.grossPayrollUploaded;
            li.healthcareCostsUploaded = ui.healthcareCostsUploaded;
            li.status = ui.status;
            listItems.add(li);
        }
        return listItems;
    }

}
