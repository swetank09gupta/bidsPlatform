package com.sapient.biddingplatform.company;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;


public class CompanyDetails {
    private String companyName;
    private int companyId;

    public CompanyDetails () {}

    public CompanyDetails (int companyId ,String name) {
        this.companyId = companyId;
        this.companyName = name;
    }

    public double getCompanyId() {
        return companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName (String companyName) {
        companyName = companyName;
    }

    public void setCompanyId(double companyId) {
        companyId = companyId;
    }

}
