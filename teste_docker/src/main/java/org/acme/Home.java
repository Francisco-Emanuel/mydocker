package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class Home {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String home() {
        return "this is home?";
    }
}
