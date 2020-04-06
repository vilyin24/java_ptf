package com.example.tests.modyl2;

import java.util.Objects;

public class AccounData {
    private final String fistname;
    private final String midlename2;
    private final String lastname;
    private String group;

    public AccounData(String fistname, String midlename2, String lastname,String group) {
        this.fistname = fistname;
        this.midlename2 = midlename2;
        this.lastname = lastname;
        this.group = group;
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

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "AccounData{" +
                "lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        AccounData that = (AccounData) o;
        return Objects.equals(fistname, that.fistname) &&
                Objects.equals(lastname, that.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fistname, lastname);
    }
}
