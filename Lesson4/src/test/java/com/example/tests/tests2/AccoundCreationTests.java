package com.example.tests.tests2;

import com.example.tests.modyl2.AccounData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AccoundCreationTests extends TestBase2 {

    @Test
    public void testAccaunCreation() throws Exception {
        app2.getGroupHelper2().returnToAccountPage();
        List<AccounData> before = app2.getGroupHelper2().getAccountList();

     app2.getGroupHelper2().createContact(new AccounData("1", "2", "3","test1"),false) ;
        List<AccounData> after = app2.getGroupHelper2().getAccountList();

        Assert.assertEquals(after.size() , before.size() + 1 );
    }

}
