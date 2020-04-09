package com.altimterik.Loan.models;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;


@Entity
@Data
//@Table(name = "file_storage")
public class FileStorage {

   

    @Id
    @GeneratedValue
    Integer blobID;

    public Integer getUserInputId() {
        return userInputId;
    }

    private Integer userInputId;

    @Lob
    private byte[] irs941;

    @Lob
    private byte[] healthcareCosts;

    @Lob
    private byte[] grossPayroll;

    private String  irs941OrginalFilesName;
    private String  healthcareCostsOrginalFilesName;
    private String  grossPayrollOrginalFilesName;

    private Boolean irs941Processed = false;

    private Boolean healthcareCostsProcessed = false;

    private Boolean grossPayrollProcessed = false;

    private Timestamp createdTs;
    
    public void setUserInputId(Integer userInputId) {
        this.userInputId = userInputId;
    }

    public FileStorage() {
    }

    public FileStorage(byte[] irs941, byte[] grossPayroll) {
        this.irs941 = irs941;
//        this.healthcareCosts = healthcareCosts;
        this.grossPayroll = grossPayroll;
    }


}
