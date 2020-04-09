package com.altimterik.Loan.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "file_storage")
public class FileStorage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer blobID;
    @Lob
    public byte[] irs941;
    @Lob
    public byte[] healthcareCosts;
    @Lob
    public byte[] grossPayroll;
    public Boolean irs941Processed;
    public Boolean healthcareCostsProcessed;
    public Boolean grossPayrollProcessed;
    public Integer userInputId;

    @Basic(optional = false)
    @Column(name = "createdTs", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    public Date createdTs;
}
