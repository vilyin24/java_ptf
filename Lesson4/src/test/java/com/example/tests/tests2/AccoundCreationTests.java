package com.example.tests.tests2;

import com.example.tests.modyl2.AccounData;
import org.testng.annotations.Test;

public class AccoundCreationTests extends TestBase2 {

    @Test
    public void testAccaunCreation() throws Exception {

      app2.getGroupHelper2().initAccountCreation();
      app2.getGroupHelper2().fillAccountForm(new AccounData("43434343", "34344343", "777","first1"),true);
      app2.getGroupHelper2().sibmitAccountCreation();
      app2.getGroupHelper2().returnToAccountPage();
    }

}
