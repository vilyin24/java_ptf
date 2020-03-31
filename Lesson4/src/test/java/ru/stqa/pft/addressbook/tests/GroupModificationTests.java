package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.CroupDate;

import java.util.List;

public class GroupModificationTests extends Testbase {
    @Test
    public void testGroupModification(){

        app.getNavigationHelper().gotoGroupPage();
        if(!app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new CroupDate("first1", null ,null));
        }
        List<CroupDate> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().selectGroup(before.size() -1);
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new CroupDate("first1", "twise2", "3"));
        app.getGroupHelper().sibmitGroupModification();
        app.getGroupHelper().returnToGroupPage();
        List<CroupDate> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size());
    }

}
