package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.CroupDate;

public class GroupHelper extends HelperBase {

    public GroupHelper(FirefoxDriver wd) {
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
}
