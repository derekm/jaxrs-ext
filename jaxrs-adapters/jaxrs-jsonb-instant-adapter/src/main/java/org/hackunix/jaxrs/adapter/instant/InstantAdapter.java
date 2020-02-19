package org.hackunix.jaxrs.adapter.instant;

import java.time.Instant;

import javax.json.Json;
import javax.json.JsonString;
import javax.json.bind.adapter.JsonbAdapter;

public class InstantAdapter implements JsonbAdapter<Instant, JsonString> {

    @Override
    public JsonString adaptToJson(Instant instant) {
        return Json.createValue(instant.toString());
    }

    @Override
    public Instant adaptFromJson(JsonString jsonString) {
        return Instant.parse(jsonString.getString());
    }

}
