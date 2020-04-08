package com.altimterik.Loan.controller;

import com.altimterik.Loan.models.LoanBasicData;
import com.altimterik.Loan.models.ScannedImage;
import com.altimterik.Loan.repository.LoanRepository;
import com.altimterik.Loan.repository.ScannedImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class LoanController {

    @Autowired
    ScannedImageRepository  scannedImageRepository;

    @Autowired
    LoanRepository loanRepository;

//    http://localhost:8080/sba/loan/upload

    @PostMapping("/sba/loan/upload")
    public ResponseEntity<String> uplaodLoan(@RequestParam( name="irs941", required = false) MultipartFile irs941,
                                             @RequestParam( name = "healthcareCosts", required = false) MultipartFile healthcareCosts
//                                             @RequestParam( name = "grossPayroll", required = false) MultipartFile grossPayroll,
//                                             @RequestBody LoanBasicData  filledLoanBasicData
    ) throws IOException {

        //        ImageModel img = new ImageModel( irs941.getOriginalFilename(),irs941.getContentType(),irs941.getBytes() );

        System.out.println( "=========test one ============");
        try {

            ScannedImage img =  new ScannedImage();
//                    new ScannedImage(irs941.getBytes(), healthcareCosts.getBytes(), grossPayroll.getBytes());

           if(irs941!=null)
               img.setIrs941(irs941.getBytes());
           if(healthcareCosts!=null)
               img.setHealthcareCosts(healthcareCosts.getBytes());
//           if()
//            if((irs941!=null)&(healthcareCosts!=null)&(grossPayroll!=null)){
//                img=  new ScannedImage(irs941.getBytes(), healthcareCosts.getBytes(), grossPayroll.getBytes());
//            }
            img = scannedImageRepository.save(img);


            LoanBasicData loanData = new LoanBasicData();

//            loanData = filledLoanBasicData;
            loanData.setBlobID(img.getBlobID());
            loanData = loanRepository.save(loanData);
            return new ResponseEntity<String>(" your loan application is created succefully with the following data " + loanData.toString(), HttpStatus.CREATED);

        }
        catch ( Exception ex)
        {
            return new ResponseEntity<String>(ex.toString(), HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/")
    String  getdata(){
        System.out.println(" this is mukera two " );
        return  " test";
    }
}