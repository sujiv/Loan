package com.altimterik.Loan.controller;

import com.altimterik.Loan.models.FileStorage;
import com.altimterik.Loan.models.UserInputs;
import com.altimterik.Loan.repository.FileStorageRepository;
import com.altimterik.Loan.repository.UserInputRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class UserInputController {

    @Autowired
    FileStorageRepository fileStorageRepository;

    @Autowired
    UserInputRepository userInputRepository;

    private  static int currentuserInputId;

    @GetMapping("/")
    String  getdata(){
        System.out.println(" this is test one" );
        return  " test";
    }

    @RequestMapping(value = "/sba/loan/upload",
            headers = "content-type=multipart/form-data",
            method = RequestMethod.POST)
    public ResponseEntity<String> uploadPolicyDocument(@RequestParam("document") List<MultipartFile> mf) {

        System.out.println("\n\n\n\n test  before and basic data==??? ");

        try {
            FileStorage image = new FileStorage();
            image.setIrs941(mf.get(0).getBytes());
            image.setIrs941OrginalFilesName(mf.get(0).getOriginalFilename());

            image.setHealthcareCostsOrginalFilesName(mf.get(1).getOriginalFilename());
            image.setHealthcareCosts(mf.get(1).getBytes());

            image.setGrossPayroll(mf.get(2).getBytes());
            image.setGrossPayrollOrginalFilesName(mf.get(2).getOriginalFilename());

            image.setUserInputId(currentuserInputId);
            image= fileStorageRepository.save(image);
            System.out.println("\n\n\n\n test  after image is inserted ");
            return new ResponseEntity<String>(" the  scanned images are  created succefully saved  " + image.getBlobID(), HttpStatus.CREATED);

        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

//    ============= Saving all basic user Input data========================

    @PostMapping("/sba/loan/upload/basicdata")
    public ResponseEntity<String> uploadPolicyDocument(@RequestBody UserInputs filledUserInputs){
        System.out.println("\n\n\n\n test  before and basic data==??? " +  filledUserInputs.getLegalName());
        System.out.println("*************************"+filledUserInputs.getTIN_EIN_SIN());
        try {
            UserInputs userInputs = new UserInputs();
            userInputs= filledUserInputs;
            userInputs = userInputRepository.save(userInputs);

            currentuserInputId= userInputs.getUserInputId();
            System.out.println("\n\n\n\n  current UserID is " +  currentuserInputId);

            return new ResponseEntity<String>("your loan application is created successfully with the following ID " + userInputs.getUserInputId(), HttpStatus.CREATED);
        }
        catch (Exception e) {
            return new ResponseEntity<>( e.toString(),HttpStatus.BAD_REQUEST);
        }

    }


}
