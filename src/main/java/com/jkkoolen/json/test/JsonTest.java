/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkkoolen.json.test;

import com.jkkoolen.json.JsonArray;
import com.jkkoolen.json.JsonObject;
import com.jkkoolen.json.JsonString;

/**
 *
 * @author jkkoolen
 */
public class 
JsonTest 
{
    public static void 
    main(String[] anArguments) 
    {
        JsonObject myObject = new JsonObject().put("name", "jan-karel")
                .put("age", 40)
                .put("surname", new JsonString("Koolen"));
        
        System.out.println(new JsonArray().add("hello")
                .add(new JsonString("world"))
                .add(50)
                .add(3.7)
                .add(myObject));
    }
}
