package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.CroupDate;

import java.util.HashSet;
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
        CroupDate group = new CroupDate(before.get(before.size() - 1).getId(),"test1", "twise2", "3");
        app.getGroupHelper().fillGroupForm(group);
        app.getGroupHelper().sibmitGroupModification();
        app.getGroupHelper().returnToGroupPage();
        List<CroupDate> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size());

        before.remove(before.size() -1);
        before.add(group);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }

}
