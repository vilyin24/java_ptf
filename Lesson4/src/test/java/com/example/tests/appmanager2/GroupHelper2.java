package com.example.tests.appmanager2;

import com.example.tests.modyl2.AccounData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class GroupHelper2 extends HelperBase2 {

    public GroupHelper2(FirefoxDriver wd) {
        super(wd);
    }

    public void returnToAccountPage() {
        //if (isElementPresent(By.id("maintable"))){
        //    return;
       // }
        click(By.linkText("home"));
    }

    public void sibmitAccountCreation() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void fillAccountForm(AccounData accounData, boolean creation) {
        type2(By.name("firstname"), accounData.getFistname());
        type2(By.name("middlename"), accounData.getMidlename2());
        type2(By.name("lastname"), accounData.getLastname());

        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(accounData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void initAccountCreation() {
        click(By.linkText("add new"));
    }
    public void selectAccount(int index) {
        wd.findElements(By.name("selected[]")).get(index).click();
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

    public void createContact(AccounData contact, boolean b) {
        initAccountCreation();
        fillAccountForm(new AccounData("43434343", "34344343", "777","first1"),true);
        sibmitAccountCreation();
        returnToAccountPage();
    }

    public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));
    }

    public int getContactCount() {
        return  wd.findElements(By.name("selected[]")).size();
    }

    public List<AccounData> getAccountList() {
        List <AccounData> accounds =new ArrayList<AccounData>();
        List <WebElement> elements = wd.findElements((By.xpath("//tbody//*[@type='checkbox']")));
        for (WebElement element : elements){
            String name = element.getTagName();
            AccounData account = new AccounData("1","2","3",null);
            accounds.add(account);
        }
        return accounds;
    }
}


