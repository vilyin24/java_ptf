package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupDelitionTests extends Testbase {

  @Test
  public void testGroupDelition() throws Exception {
    gotoGroupPage();
    selectGroup();
    deliteSelectedGroups();
    returnToGroupPage();
  }

}
