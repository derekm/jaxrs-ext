package org.hackunix.jaxrs.context.jsonb;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.ws.rs.ext.ContextResolver;

import org.hackunix.jaxrs.adapter.instant.InstantAdapter;
import org.hackunix.jaxrs.adapter.uuid.UuidAdapter;

public class JsonbContextResolver implements ContextResolver<Jsonb> {

	public Jsonb getContext(Class<?> type) {
		JsonbConfig config = new JsonbConfig()
				.withAdapters(new UuidAdapter(), new InstantAdapter());
		return JsonbBuilder.create(config);
	}

}
