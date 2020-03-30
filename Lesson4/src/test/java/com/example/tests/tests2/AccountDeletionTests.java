package com.example.tests.tests2;

import com.example.tests.modyl2.AccounData;
import org.testng.annotations.Test;

public class AccountDeletionTests extends TestBase2 {

    @Test
    public void testAccountDeletion(){
        app2.getGroupHelper2().returnToAccountPage();
        if(!app2.getGroupHelper2().isThereAContact()){
            app2.getGroupHelper2().createContact(new AccounData("43434343", "34344343", "777","first1"),true);
        }
        app2.getGroupHelper2().selectAccount();
        app2.getGroupHelper2().deliteTab();
        app2.getGroupHelper2().closedeliteTab();
        app2.getGroupHelper2().returnToAccountPage();

    }
}
