package com.android.helloworld2;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

/**
 * Created by Prateek on 4/11/2016.
 */
public class HelloWorldTest extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;
    public HelloWorldTest()
    {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mainActivity = getActivity();
    }

    public void testString()
    {
        TextView tv = (TextView) mainActivity.findViewById(R.id.textView);
        String str = tv.getText().toString();
        assertEquals("CSE110", str);
    }


    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
