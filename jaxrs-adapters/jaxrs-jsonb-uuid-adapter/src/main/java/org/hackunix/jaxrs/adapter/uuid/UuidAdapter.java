package org.hackunix.jaxrs.adapter.uuid;

import java.util.UUID;

import javax.json.Json;
import javax.json.JsonString;
import javax.json.bind.adapter.JsonbAdapter;

public class UuidAdapter implements JsonbAdapter<UUID, JsonString> {

	@Override
	public JsonString adaptToJson(UUID obj) throws Exception {
		return Json.createValue(obj.toString());
	}

	@Override
	public UUID adaptFromJson(JsonString obj) throws Exception {
		return UUID.fromString(obj.getString());
	}

}
