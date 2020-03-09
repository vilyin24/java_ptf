package com.example.tests.appmanager2;

import com.example.tests.modyl2.AccounData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager2 {
    private FirefoxDriver wd;

    public void init2() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/group.php");
        login2("admin", "secret");
    }

    private void login2(String username, String password) {
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.id("LoginForm")).click();
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//input[@value='Login']")).click();
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

    public void stop2() {
        wd.quit();
    }

    private boolean isElementPresent(By by) {
          try {
              wd.findElement(by);
              return true;
          } catch (NoSuchElementException e) {
              return false;
          }
      }

    public static boolean isAlertPresent(FirefoxDriver wd) {
          try {
              wd.switchTo().alert();
              return true;
          } catch (NoAlertPresentException e) {
              return false;
          }
      }
}
