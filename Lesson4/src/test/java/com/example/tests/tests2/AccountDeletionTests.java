package com.example.tests.tests2;

import org.testng.annotations.Test;

public class AccountDeletionTests extends TestBase2 {

    @Test
    public void testAccountDeletion(){
        app2.getGroupHelper2().returnToAccountPage();
        app2.getGroupHelper2().selectAccount();
        app2.getGroupHelper2().deliteTab();
        app2.getGroupHelper2().closedeliteTab();
        app2.getGroupHelper2().returnToAccountPage();

    }
}
