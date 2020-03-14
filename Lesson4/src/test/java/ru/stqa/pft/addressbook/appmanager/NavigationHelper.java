package ru.stqa.pft.addressbook.appmanager;

import com.example.tests.appmanager2.HelperBase2;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void gotoGroupPage() {
       click(By.linkText("groups"));
    }
}
