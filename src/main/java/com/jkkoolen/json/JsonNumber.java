/*
 * JSONDouble.java Date zo, jun 19, '11
 *
 * Jan-Karel Koolen (jkkoolen@gmail.com).
 */


package com.jkkoolen.json;

/**
 *
 * @author jkkoolen
 */
public class
JsonNumber 
extends JsonValue
{
    //--------------------------------------------------------------------------
    // public
    //--------------------------------------------------------------------------
    public
    JsonNumber(double aValue)
    {
        doubleValue(aValue);
    }

    //--------------------------------------------------------------------------
    public
    JsonNumber(int aValue)
    {
        intValue(aValue);
    }

    //--------------------------------------------------------------------------
    public
    JsonNumber(long aValue)
    {
        longValue(aValue);
    }

    //--------------------------------------------------------------------------
    @Override
    public final double
    doubleValue()
    {
        return theDValue;
    }

    //--------------------------------------------------------------------------
    @Override
    public final void
    doubleValue(double aValue)
    {
        theType = TYPE.DOUBLE;
        theDValue = aValue;
    }

    //--------------------------------------------------------------------------
    @Override
    public final int
    intValue()
    {
        return theIValue;
    }

    //--------------------------------------------------------------------------
    @Override
    public final void
    intValue(int aValue)
    {
        theType = TYPE.INT;
        theIValue = aValue;
    }

    //--------------------------------------------------------------------------
    @Override
    public final long
    longValue()
    {
        return theLValue;
    }

    //--------------------------------------------------------------------------
    @Override
    public final void
    longValue(long aValue)
    {
        theType = TYPE.LONG;
        theLValue = aValue;
    }

    //--------------------------------------------------------------------------
    @Override
    public final boolean
    isDouble()
    {
        return theType == TYPE.DOUBLE;
    }

    //--------------------------------------------------------------------------
    @Override
    public final boolean
    isLong()
    {
        return theType == TYPE.LONG;
    }

    //--------------------------------------------------------------------------
    @Override
    public final boolean
    isInt()
    {
        return theType == TYPE.INT;
    }

    //--------------------------------------------------------------------------
    @Override
    public final String
    toString()
    {
        return isInt()
                ?String.valueOf(intValue())
                :isLong()
                ?String.valueOf(longValue())
                :String.valueOf(doubleValue());
    }

    //--------------------------------------------------------------------------
    // members
    //--------------------------------------------------------------------------
    private enum TYPE
    {
        DOUBLE,
        LONG,
        INT
    }
    private TYPE theType;
    private double theDValue;
    private int theIValue;
    private long theLValue;
}
