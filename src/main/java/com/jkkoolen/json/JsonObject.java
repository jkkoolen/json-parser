/*
 * JSONObject.java Date zo, jun 19, '11
 *
 * Jan-Karel Koolen (jkkoolen@gmail.com).
 */


package com.jkkoolen.json;

import java.util.*;

/**
 *
 * @author jkkoolen
 */
public final class
JsonObject
extends JsonValue
{
    //--------------------------------------------------------------------------
    // public
    //--------------------------------------------------------------------------
    public
    JsonObject()
    {
        theValues = new LinkedHashMap<String, JsonValue>();
    }

    //--------------------------------------------------------------------------
    public final JsonObject
    put(String aKey, JsonValue aValue)
    {
        assert aKey != null : "aKey cannot be null";
        
        theValues.put(aKey, aValue);
        return this;
    }

    //--------------------------------------------------------------------------
    public final JsonObject
    put(String aKey, String aValue)
    {
        assert aKey != null : "aKey cannot be null";
        
        theValues.put(aKey, new JsonString(aValue));
        return this;
    }

    //--------------------------------------------------------------------------
    public final JsonObject
    put(String aKey, double aValue)
    {
        assert aKey != null : "aKey cannot be null";
        
        theValues.put(aKey, new JsonNumber(aValue));
        return this;
    }

    //--------------------------------------------------------------------------
    public final JsonObject
    put(String aKey, long aValue)
    {
        assert aKey != null : "aKey cannot be null";
        
        theValues.put(aKey, new JsonNumber(aValue));
        return this;
    }

    //--------------------------------------------------------------------------
    public final JsonObject
    put(String aKey, int aValue)
    {
        assert aKey != null : "aKey cannot be null";
        
        theValues.put(aKey, new JsonNumber(aValue));
        return this;
    }

    //--------------------------------------------------------------------------
    public final JsonObject
    put(String aKey, boolean aValue)
    {
        assert aKey != null : "aKey cannot be null";
        
        theValues.put(aKey, new JsonBoolean(aValue));
        return this;
    }

    //--------------------------------------------------------------------------
    public final boolean
    containsKey(String aKey)
    {
        return theValues.containsKey(aKey);
    }

    //--------------------------------------------------------------------------
    public final JsonValue
    get(String aKey)
    {
        return theValues.get(aKey);
    }

    //--------------------------------------------------------------------------
    public final Set<String>
    keys()
    {
        return theValues.keySet();
    }

    //--------------------------------------------------------------------------
    public final Iterator<String>
    keyIterator()
    {
        return theValues.keySet().iterator();
    }

    //--------------------------------------------------------------------------
    public final Collection<JsonValue>
    values()
    {
        return theValues.values();
    }
    //--------------------------------------------------------------------------
    public final Iterator<JsonValue>
    valueIterator()
    {
        return theValues.values().iterator();
    }

    //--------------------------------------------------------------------------
    @Override
    public final JsonObject
    objectValue()
    {
        return this;
    }

    //--------------------------------------------------------------------------
    @Override
    public final boolean
    isObject()
    {
        return true;
    }

    //--------------------------------------------------------------------------
    @Override
    public final String
    toString()
    {
        StringBuilder myBuilder = builder().append('{');
        for(String myKey : theValues.keySet())
        {
            myBuilder.append('"')
                .append(myKey)
                .append("\":")
                .append(theValues.get(myKey).toString())
                .append(',');
        }
        myBuilder.setLength(myBuilder.length()-1);
        return myBuilder.append('}').toString();
    }
    //--------------------------------------------------------------------------
    // members
    //--------------------------------------------------------------------------
    private LinkedHashMap<String, JsonValue> theValues;
}
