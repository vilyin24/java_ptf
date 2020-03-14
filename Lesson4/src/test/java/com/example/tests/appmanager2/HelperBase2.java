package com.example.tests.appmanager2;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelperBase2 {
    protected FirefoxDriver wd;

    public HelperBase2(FirefoxDriver wd) {
        this.wd = wd;
    }

    protected void click(By locator) {
        wd.findElement(locator).click();
    }

    protected void type2(By locator2, String text2) {
        click(locator2);
        wd.findElement(locator2).clear();
        wd.findElement(locator2).sendKeys(text2);
    }
    public boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
