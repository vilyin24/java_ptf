package ru.stqa.pft.addressbook.tests;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.CroupDate;

public class GroupCreationTests extends Testbase {


    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new CroupDate("first1", "twise2", "3"));
        app.getGroupHelper().sibmitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }


}
