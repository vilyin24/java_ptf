package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.CroupDate;

import java.util.List;

public class GroupDelitionTests extends Testbase {

  @Test
  public void testGroupDelition() throws Exception {

    app.getNavigationHelper().gotoGroupPage();
    if(!app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new CroupDate("first1", null ,null));
    }
    List<CroupDate> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().selectGroup(before.size() -1);
    app.getGroupHelper().deliteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
    List<CroupDate> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() -1);

  }

}
