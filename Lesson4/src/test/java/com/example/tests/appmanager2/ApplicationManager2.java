package com.example.tests.appmanager2;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager2 {
    FirefoxDriver wd;

    private GroupHelper2 groupHelper2 ;

    private SessionHelper2 sessionHelper2;
    public void init2() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/group.php");
        groupHelper2 = new GroupHelper2(wd);
        sessionHelper2 = new SessionHelper2(wd);
        sessionHelper2.login2("admin", "secret");
    }



    public void stop2() {
        wd.quit();
    }




    public static boolean isAlertPresent(FirefoxDriver wd) {
          try {
              wd.switchTo().alert();
              return true;
          } catch (NoAlertPresentException e) {
              return false;
          }
      }

    public GroupHelper2 getGroupHelper2() {
        return groupHelper2;
    }
}
