package com.example.tests.tests2;

import org.testng.annotations.Test;

public class AccoundModificationTests extends TestBase2 {


    @Test
    public void testAccountModification (){
        app2.getGroupHelper2().returnToAccountPage();
        app2.getGroupHelper2().selectAccount();
        app2.getGroupHelper2().tabToEdit();
        app2.getGroupHelper2().tabToUpdate();
        app2.getGroupHelper2().returnToAccountPage();

    }
}
