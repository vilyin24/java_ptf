package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDelitionTests extends Testbase {

  @Test
  public void testGroupDelition() throws Exception {
    app.gotoGroupPage();
    app.selectGroup();
    app.deliteSelectedGroups();
    app.returnToGroupPage();
  }

}
