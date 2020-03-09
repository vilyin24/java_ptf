package com.example.tests.modyl2;

public class AccounData {
    private final String fistname;
    private final String midlename2;
    private final String lastname;

    public AccounData(String fistname, String midlename2, String lastname) {
        this.fistname = fistname;
        this.midlename2 = midlename2;
        this.lastname = lastname;
    }

    public String getFistname() {
        return fistname;
    }

    public String getMidlename2() {
        return midlename2;
    }

    public String getLastname() {
        return lastname;
    }
}
