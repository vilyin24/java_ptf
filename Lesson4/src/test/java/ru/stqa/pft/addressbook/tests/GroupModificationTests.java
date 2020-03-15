package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.CroupDate;

public class GroupModificationTests extends Testbase {
    @Test
    public void testGroupModification(){
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new CroupDate("first1", "twise2", "3"));
        app.getGroupHelper().sibmitGroupModification();
        app.getGroupHelper().returnToGroupPage();

    }

}
