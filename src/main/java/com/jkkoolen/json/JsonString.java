/*
 * JSONString.java Date zo, jun 19, '11
 *
 * Jan-Karel Koolen (jkkoolen@gmail.com).
 */


package com.jkkoolen.json;

/**
 *
 * @author jkkoolen
 */
public final class
JsonString 
extends JsonValue
{
    //--------------------------------------------------------------------------
    // public
    //--------------------------------------------------------------------------
    public
    JsonString(String aValue)
    {
        stringValue(aValue);
    }

    //--------------------------------------------------------------------------
    @Override
    public final String
    stringValue()
    {
        return theValue;
    }

    //--------------------------------------------------------------------------
    @Override
    public final void
    stringValue(String aValue)
    {
       theValue = aValue;
    }

    //--------------------------------------------------------------------------
    @Override
    public final boolean
    isString()
    {
        return true;
    }

    //--------------------------------------------------------------------------
    @Override
    public final String
    toString()
    {
        return builder().append('"')
            .append(theValue)
            .append('"').toString();
    }

    //--------------------------------------------------------------------------
    // members
    //--------------------------------------------------------------------------
    private String theValue;
}
