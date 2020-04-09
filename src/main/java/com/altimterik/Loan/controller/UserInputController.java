package com.altimterik.Loan.controller;

import com.altimterik.Loan.models.FileStorage;
import com.altimterik.Loan.models.UserInputs;
import com.altimterik.Loan.repository.FileStorageRepository;
import com.altimterik.Loan.repository.UserInputRepository;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class UserInputController {

    @Autowired
    FileStorageRepository fileStorageRepository;

    @Autowired
    UserInputRepository userInputRepository;

    @GetMapping("/")
    String  getdata(){
        System.out.println(" this is test one" );
        return  " test";
    }

    @RequestMapping(value = "/sba/loan/upload/{id}",
            headers = "content-type=multipart/form-data",
            method = RequestMethod.POST)
    public ResponseEntity<Integer> uploadPolicyDocument(@RequestParam("document") List<MultipartFile> mf, @PathVariable("id") Integer id) {


        System.out.println("image file name \n\n\n\n\n  " + mf.get(0).getName());


        try {
            FileStorage image = new FileStorage();
            if(mf.size()>=1 && mf.get(0)!=null) {
                image.setIrs941(mf.get(0).getBytes());
                image.setIrs941OrginalFilesName(mf.get(0).getOriginalFilename());

            }

            if(mf.size()>=2 && mf.get(1)!=null) {

                image.setGrossPayroll(mf.get(1).getBytes());
                image.setGrossPayrollOrginalFilesName(mf.get(1).getOriginalFilename());
            }

            if(mf.size()>=3 && mf.get(2)!=null) {
                image.setHealthcareCosts(mf.get(2).getBytes());
                image.setHealthcareCostsOrginalFilesName(mf.get(2).getOriginalFilename());
            }


            image.setUserInputId(id);
            image= fileStorageRepository.save(image);
            return new ResponseEntity<>(image.getBlobID(), HttpStatus.CREATED);

        } catch (IOException e) {
            return new ResponseEntity<>( HttpStatus.BAD_REQUEST);
        }

    }

//    ============= Saving all basic user Input data========================

    @PostMapping("/sba/loan/upload/basicdata")
    public ResponseEntity<Integer> uploadPolicyDocument(@RequestBody UserInputs filledUserInputs){

        try {
            UserInputs userInputs;

            userInputs = userInputRepository.save(filledUserInputs);

            return new ResponseEntity<>(userInputs.getUserInputId(), HttpStatus.CREATED);
        }
        catch (Exception e) {
            return new ResponseEntity<>( HttpStatus.BAD_REQUEST);
        }

    }

}
