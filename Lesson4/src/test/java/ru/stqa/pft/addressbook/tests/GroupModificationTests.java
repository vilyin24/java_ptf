package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.CroupDate;

public class GroupModificationTests extends Testbase {
    @Test
    public void testGroupModification(){

        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        if(!app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new CroupDate("first1", null ,null));
        }
        app.getGroupHelper().selectGroup(before -1);
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new CroupDate("first1", "twise2", "3"));
        app.getGroupHelper().sibmitGroupModification();
        app.getGroupHelper().returnToGroupPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before);
    }

}
