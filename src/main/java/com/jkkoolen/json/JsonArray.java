/*
 * JSONArray.java Date zo, jun 19, '11
 *
 * Jan-Karel Koolen (jkkoolen@gmail.com).
 */


package com.jkkoolen.json;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jkkoolen
 */
public final class
JsonArray
extends JsonValue
{
    //--------------------------------------------------------------------------
    // public
    //--------------------------------------------------------------------------
    public
    JsonArray()
    {
        theValues = new ArrayList<JsonValue>();
    }

    //--------------------------------------------------------------------------
    @Override
    public final JsonArray
    arrayValue()
    {
        return this;
    }

    //--------------------------------------------------------------------------
    @Override
    public final boolean
    isArray()
    {
        return true;
    }

    //--------------------------------------------------------------------------
    public final int
    size()
    {
        return theValues.size();
    }

    //--------------------------------------------------------------------------
    public final JsonArray
    add(JsonValue aValue)
    {
        theValues.add(aValue);
        return this;
    }

    //--------------------------------------------------------------------------
    public final JsonArray
    add(String aValue)
    {
        theValues.add(new JsonString(aValue));
        return this;
    }

    //--------------------------------------------------------------------------
    public final JsonArray
    add(double aValue)
    {
        theValues.add(new JsonNumber(aValue));
        return this;
    }

    //--------------------------------------------------------------------------
    public final JsonArray
    add(int aValue)
    {
        theValues.add(new JsonNumber(aValue));
        return this;
    }

    //--------------------------------------------------------------------------
    public final JsonArray
    add(long aValue)
    {
        theValues.add(new JsonNumber(aValue));
        return this;
    }

    //--------------------------------------------------------------------------
    public final JsonArray
    add(boolean aValue)
    {
        theValues.add(new JsonBoolean(aValue));
        return this;
    }

    //--------------------------------------------------------------------------
    public final JsonValue
    get(int anIndex)
    {
        return theValues.get(anIndex);
    }

    //--------------------------------------------------------------------------
    public final List<JsonValue>
    values()
    {
        return theValues;
    }

    //--------------------------------------------------------------------------
    public final Iterator<JsonValue>
    iterator()
    {
        return theValues.iterator();
    }

    //--------------------------------------------------------------------------
    @Override
    public final String
    toString()
    {
        StringBuilder myBuilder = builder().append('[');
        for(JsonValue myValue : theValues)
        {
            myBuilder.append(myValue)
                .append(',');
        }
        myBuilder.setLength(myBuilder.length()-1);
        return myBuilder.append(']').toString();
    }

    //--------------------------------------------------------------------------
    // members
    //--------------------------------------------------------------------------
    private List<JsonValue> theValues;
}
