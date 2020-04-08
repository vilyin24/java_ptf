package com.example.tests.modyl2;

import java.util.Objects;

public class AccounData {
    private final String fistname;
    private final String midlename2;
    private final String lastname;
    private  final String group;
    private final String id;

    @Override
    public String toString() {
        return "AccounData{" +
                "lastname='" + lastname + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccounData that = (AccounData) o;
        return Objects.equals(lastname, that.lastname) &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastname, id);
    }

    public String getId() {
        return id;
    }

    public AccounData(String id, String fistname, String midlename2, String lastname, String group) {
        this.id= id;
        this.fistname = fistname;
        this.midlename2 = midlename2;
        this.lastname = lastname;
        this.group = group;
    }
   public AccounData( String fistname, String midlename2, String lastname, String group) {
       this.id = null;
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

}
