package org.acme;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/teste-banco")
public class UserResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional 
    public List<User> teste() {
        User novoUsuario = new User();
        novoUsuario.name = "Pudim " + System.currentTimeMillis(); // Nome único para ver crescendo
        novoUsuario.persist();

        return User.listAll();
    }
}