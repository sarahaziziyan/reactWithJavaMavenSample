package com.airhacks;

import java.util.stream.Stream;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("numbers")
public class NumbersResource {
    
    @GET
    public JsonArray numbers(){
        JsonArrayBuilder array =  Json.createArrayBuilder();
        Stream<String> numbersStream =  Stream.generate(System::currentTimeMillis)
                .map(String::valueOf)
                .limit(10);
        numbersStream.forEach(array::add);
        return array.build();
    }
    
}
