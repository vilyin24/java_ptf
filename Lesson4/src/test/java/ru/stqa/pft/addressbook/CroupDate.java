package ru.stqa.pft.addressbook;

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
}
