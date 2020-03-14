package com.example.tests.appmanager2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper2 extends HelperBase2 {

    public SessionHelper2(FirefoxDriver wd) {
        super(wd);
    }
    public void login2(String username, String password) {
        type2(By.name("user"),username);
        type2(By.name("pass"),password);
        click(By.xpath("//input[@value='Login']"));
    }
}
