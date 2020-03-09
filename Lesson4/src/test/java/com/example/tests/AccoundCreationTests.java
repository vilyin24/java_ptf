package com.example.tests;

import org.testng.annotations.Test;

public class AccoundCreationTests extends TestBase2 {

    @Test
    public void testAccaunCreation() throws Exception {

      initAccountCreation();
      fillAccountForm(new AccounData("1", "2", "3"));
      sibmitAccountCreation();
      returnToAccountPage();
    }

}
