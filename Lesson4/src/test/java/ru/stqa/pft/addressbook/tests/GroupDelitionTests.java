package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.CroupDate;

public class GroupDelitionTests extends Testbase {

  @Test
  public void testGroupDelition() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    if(!app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new CroupDate("first1", null ,null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deliteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }

}
