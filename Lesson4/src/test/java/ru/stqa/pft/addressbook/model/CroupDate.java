package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class CroupDate {
    private final String id;
    private final String name;
    private final String header;
    private final String footer;

      public CroupDate(String name, String header, String footer) {
        this.name = name;
          this.id = null;
          this.header = header;
        this.footer = footer;
    }
    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CroupDate croupDate = (CroupDate) o;
        return Objects.equals(id, croupDate.id) &&
                Objects.equals(name, croupDate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "CroupDate{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public CroupDate(String id, String name, String header, String footer) {
        this.name = name;
        this.id = id;
        this.header = header;
        this.footer = footer;
    }

    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }

}
