package com.jkkoolen.json.parser;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import com.jkkoolen.json.parser.*;
import com.jkkoolen.json.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        String myName = "Jan-Karel";
        String myDateOfBirth = "07-05-1971";
        String mySurName = "Koolen";
        String myHello = "hello";
        String myWorld = "world";
        int myFifty = 50;
        double myThreePointSeven = 3.7;
        JsonObject myObject = new JsonObject().put("name", myName)
                .put("dateofbirth", myDateOfBirth)
                .put("surname", new JsonString(mySurName));
        JsonArray myArray = new JsonArray().add(myHello)
                .add(new JsonString(myWorld))
                .add(myFifty)
                .add(myThreePointSeven)
                .add(myObject);

        assertEquals(myArray.size(), 5);
        assertEquals(myObject.get("name").stringValue(), myName);
        assertEquals(myObject.get("dateofbirth").stringValue(), myDateOfBirth);
        assertEquals(myObject.get("surname").stringValue(), mySurName);
        assertEquals(myArray.get(0).stringValue(), myHello);
        assertEquals(myArray.get(1).stringValue(), myWorld);
        assertEquals(myArray.get(2).intValue(), myFifty);
        assertEquals(myArray.get(3).doubleValue(), myThreePointSeven);
    }
}
