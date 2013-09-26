/*
 * JSONValue.java Date zo, jun 19, '11
 *
 * Jan-Karel Koolen (jkkoolen@gmail.com).
 */


package com.jkkoolen.json;

/**
 *
 * @author jkkoolen
 */
public abstract class
JsonValue 
{
    //--------------------------------------------------------------------------
    //  public
    //--------------------------------------------------------------------------
    public JsonObject 
    objectValue()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //--------------------------------------------------------------------------
    public JsonArray 
    arrayValue()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //--------------------------------------------------------------------------
    public String 
    stringValue()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //--------------------------------------------------------------------------
    public void 
    stringValue(String aValue)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //--------------------------------------------------------------------------
    public boolean 
    booleanValue()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //--------------------------------------------------------------------------
    public void 
    booleanValue(boolean aValue)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //--------------------------------------------------------------------------
    public double 
    doubleValue()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //--------------------------------------------------------------------------
    public void
    doubleValue(double aValue)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //--------------------------------------------------------------------------
    public int 
    intValue()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //--------------------------------------------------------------------------
    public void 
    intValue(int aValue)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //--------------------------------------------------------------------------
    public long 
    longValue()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //--------------------------------------------------------------------------
    public void 
    longValue(long aValue)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //--------------------------------------------------------------------------
    public boolean
    isObject()
    {
        return false;
    }

    //--------------------------------------------------------------------------
    public boolean
    isArray()
    {
        return false;
    }

    //--------------------------------------------------------------------------
    public boolean
    isString()
    {
        return false;
    }

    //--------------------------------------------------------------------------
    public boolean
    isBoolean()
    {
        return false;
    }

    //--------------------------------------------------------------------------
    public boolean
    isDouble()
    {
        return false;
    }

    //--------------------------------------------------------------------------
    public boolean
    isInt()
    {
        return false;
    }

    //--------------------------------------------------------------------------
    public boolean
    isLong()
    {
        return false;
    }
    
    //--------------------------------------------------------------------------
    public final StringBuilder
    builder()
    {
        theBuilder.setLength(0);
        return theBuilder;
    }
    
    //--------------------------------------------------------------------------
    // members
    //--------------------------------------------------------------------------
    private StringBuilder theBuilder = new StringBuilder();
}
