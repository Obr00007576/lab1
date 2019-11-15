package ru.spbstu.telematics.java.ls;

import org.junit.Test;
import java.util.Set;
import org.junit.Assert;

public class ls_test
{
    @Test
    public void StringSetTest1()
    {
        Set<String> a=ls.getFile("C://");
        Set<String> b=ls.getFile();
        Assert.assertNotEquals(a, b);
    }
    @Test
    public void StringSetTest2()
    {
        Set<String> a=ls.getFile();
        Set<String> b=ls.getFile();
        Assert.assertEquals(a,b);
    }
}
