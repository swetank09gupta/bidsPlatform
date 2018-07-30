package com.sapient.biddingplatform.company;

import java.util.Date;

public class Bid {
    private double bidAmount;
    private Date date;
    private CompanyDetails company;
    private Metals metals;

    public Bid(double bidAmount, Date date, CompanyDetails company, Metals metals) {
        this.bidAmount = bidAmount;
        this.date = date;
        this.company = company;
        this.metals = metals;
    }

    public double getBidAmount() {

        return bidAmount;
    }

    public void setBidAmount(double bidAmount) {
        this.bidAmount = bidAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public CompanyDetails getCompany() {
        return company;
    }

    public void setCompany(CompanyDetails company) {
        this.company = company;
    }

    public Metals getMetals() {
        return metals;
    }

    public void setMetals(Metals metals) {
        this.metals = metals;
    }
}
