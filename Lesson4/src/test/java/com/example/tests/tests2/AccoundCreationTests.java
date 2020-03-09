package com.example.tests.tests2;

import com.example.tests.modyl2.AccounData;
import org.testng.annotations.Test;

public class AccoundCreationTests extends TestBase2 {

    @Test
    public void testAccaunCreation() throws Exception {

      app2.initAccountCreation();
      app2.fillAccountForm(new AccounData("1", "2", "3"));
      app2.sibmitAccountCreation();
      app2.returnToAccountPage();
    }

}
