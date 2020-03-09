package ru.stqa.pft.addressbook;
import org.testng.annotations.*;

public class GroupCreationTests extends Testbase {


    @Test
    public void testGroupCreation() throws Exception {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new CroupDate("first1", "twise2", "3"));
        sibmitGroupCreation();
        returnToGroupPage();
    }


}
