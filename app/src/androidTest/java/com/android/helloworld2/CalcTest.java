package com.android.helloworld2;

import junit.framework.TestCase;

/**
 * Created by Prateek on 4/11/2016.
 */
public class CalcTest extends TestCase{

    public void testAdd()
    {
        assertEquals(new Calculator().add(10,20),30);
    }
}
