package ru.stqa.pft.addressbook;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AccoundCreationTests extends TestBase {

  @Test
  public void testAccaunCreation() throws Exception {

    initContactCreation();
    fillContactForm(new ContactData("6555566", "58555565", "55114"));
    submitContactForm();
    returnToContactPage();

   }
  }

