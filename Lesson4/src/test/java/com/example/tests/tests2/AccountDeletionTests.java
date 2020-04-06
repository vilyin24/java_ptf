package com.example.tests.tests2;

import com.example.tests.modyl2.AccounData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AccountDeletionTests extends TestBase2 {

    @Test
    public void testAccountDeletion(){
        app2.getGroupHelper2().returnToAccountPage();
        if(!app2.getGroupHelper2().isThereAContact()){
            app2.getGroupHelper2().createContact(new AccounData("43434343", "34344343", "777","first1"),true);
        }
        List<AccounData> before = app2.getGroupHelper2().getAccountList();
        app2.getGroupHelper2().selectAccount(0);
        app2.getGroupHelper2().deliteTab();
        app2.getGroupHelper2().closedeliteTab();
        app2.getGroupHelper2().returnToAccountPage();
        List<AccounData> after = app2.getGroupHelper2().getAccountList();
        Assert.assertEquals(after.size() , before.size()-1);

      before.remove(before.size() -1);
      Assert.assertEquals(before, after);
}
    }


