package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.CroupDate;

public class GroupDelitionTests extends Testbase {

  @Test
  public void testGroupDelition() throws Exception {

    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    if(!app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new CroupDate("first1", null ,null));
    }
    app.getGroupHelper().selectGroup(before -1);
    app.getGroupHelper().deliteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before -1);

  }

}
