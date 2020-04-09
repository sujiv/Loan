//package com.altimterik.Loan.controller;
//
//import com.altimterik.Loan.models.LoanBasicData;
//import com.altimterik.Loan.models.ScannedImage;
//import com.altimterik.Loan.repository.LoanRepository;
//import com.altimterik.Loan.repository.ScannedImageRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//import java.util.List;
//
//@RestController
////@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
//public class LoanController {
//
//    @Autowired
//    ScannedImageRepository  scannedImageRepository;
//
//    @Autowired
//    LoanRepository loanRepository;
//
////    http://localhost:8080/sba/loan/upload
//
////    @PostMapping("/sba/loan/upload")
//
////    @RequestMapping(value = "/sba/loan/upload",
////            headers = "content-type=multipart/form-data",
////            method = RequestMethod.POST)
//    public ResponseEntity<String> uplaodLoan(
//
//            @RequestParam( name="files", required = false) MultipartFile files2
////            @RequestParam( name="irs941", required = false) MultipartFile [] irs941
////            @RequestParam( name = "healthcare", required = false) MultipartFile healthcareImage,
////            @RequestParam( name = "gross_payroll", required = false) MultipartFile grossPayrollImage,
////          @RequestBody LoanBasicData  filledLoanBasicData
//    ) throws IOException {
//
//
//        System.out.println( "=========test one ============");
//        System.out.println("  \n\n\n\n my  Image file  " +   files2.isEmpty());
//        try {
//            ScannedImage img =  new ScannedImage();
////              img.setIrs941(files2[0].getBytes());
////              img.setHealthcareCosts(files2[1].getBytes());
////              img.setGrossPayroll(files2[2].getBytes());
//
//            img = scannedImageRepository.save(img);
//
//            System.out.println( "=========test one ============");
//
////           if(irs941!=null)
////               img.setIrs941(irs941.getBytes());
//
////           if(healthcareImage!=null)
////               img.setHealthcareCosts(healthcareImage.getBytes());
////
////           if(!grossPayrollImage.isEmpty()|| grossPayrollImage!=null)
////               img.setGrossPayroll(grossPayrollImage.getBytes());
//
////           img = scannedImageRepository.save(img);
//
//            System.out.println( "=========test one after saving into image table ============");
//
//            LoanBasicData loanData = new LoanBasicData();
//
////            loanData = filledLoanBasicData;
//            loanData.setBlobID(img.getBlobID());
//            loanData = loanRepository.save(loanData);
//            return new ResponseEntity<String>(" your loan application is created succefully with the following ID " + loanData.getId(), HttpStatus.CREATED);
//
//        }
//        catch ( Exception ex)
//        {
//            return new ResponseEntity<String>(ex.toString(), HttpStatus.BAD_REQUEST);
//        }
//
//    }
//
//
//    @GetMapping("/")
//    String  getdata(){
//        System.out.println(" this is mukera two " );
//        return  " test";
//    }
//
//
//    @RequestMapping(value = "/sba/loan/upload",
//            headers = "content-type=multipart/form-data",
//            method = RequestMethod.POST)
//    public ResponseEntity<Void> uploadPolicyDocument(@RequestParam("document") List<MultipartFile> mf) {
//
//        System.out.println("\n\n\nn\n test  before");
//        try {
//            ScannedImage image = new ScannedImage();
//
////            for(MultipartFile mf: multipartFile)
////            {
////                byte[] bytes = mf.get(0).getBytes();
//            image.setIrs941(mf.get(0).getBytes());
//            image.setHealthcareCosts(mf.get(1).getBytes());
//            image.setGrossPayroll(mf.get(2).getBytes());
//
//            image = scannedImageRepository.save(image);
//            System.out.println("\n\n\nn\n test  after");
//
////            }
//
//        } catch (IOException e) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//
//        return ResponseEntity.ok().build();
//    }
//
//
//}