/*
 * JSONBoolean.java Date zo, jun 19, '11
 *
 * Jan-Karel Koolen (jkkoolen@gmail.com).
 */


package com.jkkoolen.json;

/**
 *
 * @author jkkoolen
 */
public class
JsonBoolean 
extends JsonValue
{
    //--------------------------------------------------------------------------
    // public
    //--------------------------------------------------------------------------
    public
    JsonBoolean(boolean aValue)
    {
        theValue = aValue;
    }

    //--------------------------------------------------------------------------
    @Override
    public final boolean
    booleanValue()
    {
        return theValue;
    }

    //--------------------------------------------------------------------------
    @Override
    public final void
    booleanValue(boolean aValue)
    {
        theValue = aValue;
    }

    //--------------------------------------------------------------------------
    @Override
    public final boolean
    isBoolean()
    {
        return true;
    }

    //--------------------------------------------------------------------------
    @Override
    public final String
    toString()
    {
        return String.valueOf(theValue);
    }

    //--------------------------------------------------------------------------
    // members
    //--------------------------------------------------------------------------
    private boolean theValue;
}
