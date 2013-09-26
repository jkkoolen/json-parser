/*
 * JSON.java Date zo, jun 19, '11
 *
 * Jan-Karel Koolen (jkkoolen@gmail.com).
 */


package com.jkkoolen.json;

import com.jkkoolen.json.parser.JSONHandler;
import com.jkkoolen.json.parser.ParseException;
import java.io.InputStream;
import java.io.Reader;

/**
 *
 * @author jkkoolen
 */
public final class
JSON
{
    //--------------------------------------------------------------------------
    // public static
    //--------------------------------------------------------------------------
    public static JsonValue
    parse(Reader aReader)
    throws ParseException
    {
        return theInstance.parse(new JSONHandler(aReader));
    }

    //--------------------------------------------------------------------------
    public static JsonValue
    parse(InputStream aStream)
    throws ParseException
    {
        return theInstance.parse(new JSONHandler(aStream));
    }

    //--------------------------------------------------------------------------
    // private
    //--------------------------------------------------------------------------
    private
    JSON()
    {
        //empty
    }

    //--------------------------------------------------------------------------
    private JsonValue
    parse(JSONHandler aHandler)
    throws ParseException
    {
        return aHandler.parse();
    }

    //--------------------------------------------------------------------------
    // members
    //--------------------------------------------------------------------------
    private static final JSON theInstance = new JSON();
}
