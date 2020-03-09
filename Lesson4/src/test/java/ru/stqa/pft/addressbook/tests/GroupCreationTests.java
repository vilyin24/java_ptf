package ru.stqa.pft.addressbook.tests;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.CroupDate;

public class GroupCreationTests extends Testbase {


    @Test
    public void testGroupCreation() throws Exception {
        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new CroupDate("first1", "twise2", "3"));
        app.sibmitGroupCreation();
        app.returnToGroupPage();
    }


}
