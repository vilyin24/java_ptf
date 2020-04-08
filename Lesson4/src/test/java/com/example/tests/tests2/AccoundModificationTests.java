package com.example.tests.tests2;

import com.example.tests.modyl2.AccounData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;

public class AccoundModificationTests extends TestBase2 {


    @Test
    public void testAccountModification (){
        app2.getGroupHelper2().returnToAccountPage();
        if(!app2.getGroupHelper2().isThereAContact()){
            app2.getGroupHelper2().createContact(new AccounData("43434343", "34344343", "777","first1"),true);
        }
        List<AccounData> before = app2.getGroupHelper2().getAccountList();
        app2.getGroupHelper2().selectAccount(before.size()-1);
        app2.getGroupHelper2().tabToEdit();
        AccounData accound = new AccounData(before.get(before.size()-1).getId(),"1", "2", "3", "test1") ;

        app2.getGroupHelper2().fillAccountForm(accound,false); ;

        app2.getGroupHelper2().tabToUpdate();
        app2.getGroupHelper2().returnToAccountPage();
        List<AccounData> after = app2.getGroupHelper2().getAccountList();
        Assert.assertEquals(after.size() , before.size()  );

        before.remove(before.size() - 1);
        before.add(accound);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }
}
