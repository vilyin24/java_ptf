package ru.stqa.sanbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.sandbox.Equation;

public class EquationTest {

    @Test
    public void test0(){
        Equation e = new Equation(1,1,1);
        Assert.assertEquals(e.rootnambe(),0);
    }
    @Test
    public void test1() {
        Equation e = new Equation(1, 2, 1);
        Assert.assertEquals(e.rootnambe(), 1);
    }
    @Test
    public void test2(){
        Equation e = new Equation(1,5,6);
        Assert.assertEquals(e.rootnambe(),2);
    }
}
