package com.example.tests.tests2;

import com.example.tests.appmanager2.ApplicationManager2;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase2 {

    protected final ApplicationManager2 app2 = new ApplicationManager2();

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        app2.init2();
    }

    @AfterMethod(alwaysRun = true)
      public void tearDown() throws Exception {
        app2.stop2();
    }

}

