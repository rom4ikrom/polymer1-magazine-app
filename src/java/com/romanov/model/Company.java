package com.romanov.model;

public class Company extends Contact {
    
    private String companyName;
    
    public Company (int id, String companyName, String firstName, String lastName, String email, String tel) {
        super(id, firstName, lastName, email, tel);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
}
