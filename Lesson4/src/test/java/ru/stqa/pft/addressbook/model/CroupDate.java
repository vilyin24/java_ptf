package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class CroupDate {
    private final String name;
    private final String header;
    private final String footer;

    public CroupDate(String name, String header, String footer) {
        this.name = name;
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

    @Override
    public String toString() {
        return "CroupDate{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        CroupDate croupDate = (CroupDate) o;
        return Objects.equals(name, croupDate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
