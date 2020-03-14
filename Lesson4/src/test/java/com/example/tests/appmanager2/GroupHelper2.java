package com.example.tests.appmanager2;

import com.example.tests.modyl2.AccounData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupHelper2 {
   private FirefoxDriver wd;

    public GroupHelper2(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void returnToAccountPage() {
      wd.findElement(By.linkText("home")).click();;
    }

    public void sibmitAccountCreation() {
      wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }

    public void fillAccountForm(AccounData accounData) {
      wd.findElement(By.name("firstname")).click();
      wd.findElement(By.name("firstname")).clear();
      wd.findElement(By.name("firstname")).sendKeys(accounData.getFistname());
      wd.findElement(By.name("theform")).click();
      wd.findElement(By.name("middlename")).click();
      wd.findElement(By.name("middlename")).clear();
      wd.findElement(By.name("middlename")).sendKeys(accounData.getMidlename2());
      wd.findElement(By.name("lastname")).click();
      wd.findElement(By.name("lastname")).clear();
      wd.findElement(By.name("lastname")).sendKeys(accounData.getLastname());
      wd.findElement(By.name("theform")).click();
    }

    public void initAccountCreation() {
      wd.findElement(By.linkText("add new")).click();
    }
}
