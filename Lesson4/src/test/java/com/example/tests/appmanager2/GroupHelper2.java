package com.example.tests.appmanager2;

import com.example.tests.modyl2.AccounData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupHelper2 extends HelperBase2 {

    public GroupHelper2(FirefoxDriver wd) {
        super(wd);
    }

    public void returnToAccountPage() {
        click(By.linkText("home"));
        ;
    }

    public void sibmitAccountCreation() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void fillAccountForm(AccounData accounData) {
        type2(By.name("firstname"), accounData.getFistname());
        type2(By.name("middlename"), accounData.getMidlename2());
        type2(By.name("lastname"), accounData.getLastname());
    }

    public void initAccountCreation() {
        click(By.linkText("add new"));
    }
    public void selectAccount() {
        click(By.name("selected[]"));
    }

    public void deliteTab() {
        click(By.xpath("//input[@value='Delete']"));
    }
    public void closedeliteTab() {
        wd.switchTo().alert().accept();
    }

    public void tabToEdit() {
        click((By.xpath("//img[@alt='Edit']")));
    }

    public void tabToUpdate() {
        click(By.xpath("(//input[@name='update'])[2]"));

    }

}


