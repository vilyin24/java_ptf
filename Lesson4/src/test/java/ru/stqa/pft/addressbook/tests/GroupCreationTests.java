package ru.stqa.pft.addressbook.tests;
import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.CroupDate;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class GroupCreationTests extends Testbase {


    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        List<CroupDate> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().createGroup(new CroupDate("first1", "2", "3224234"));
        List<CroupDate> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size() + 1 );
    }
}
