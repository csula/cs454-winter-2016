package edu.csula.cs454.example;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {
    @Test
    public void testGetName() {
        Assert.assertEquals("Search Engine", HelloWorld.getName());
    }
}
