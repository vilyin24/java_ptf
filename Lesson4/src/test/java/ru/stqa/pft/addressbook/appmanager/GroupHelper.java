package ru.stqa.pft.addressbook.appmanager;

import com.example.tests.modyl2.AccounData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.CroupDate;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void returnToGroupPage() {
        click(By.linkText("groups"));
        click(By.linkText("Logout"));
    }

    public void sibmitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(CroupDate croupDate) {
        type(By.name("group_name"), croupDate.getName());
        type(By.name("group_header"), croupDate.getHeader());
        type(By.name("group_footer"), croupDate.getFooter());
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void deliteSelectedGroups() {
        click(By.name("delete"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void sibmitGroupModification() {
        click(By.name("update"));
    }

    public void returnToAccountPage() {
        click(By.linkText("home"));
        ;
    }

    public void sibmitAccountCreation() {
        click(By.xpath("(//input[@name='submit'])[2]"));
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