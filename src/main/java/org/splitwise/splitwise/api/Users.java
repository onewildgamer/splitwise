package org.splitwise.splitwise.api;

import org.splitwise.splitwise.model.UserRequest;

import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
public interface Users {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Response createUser(@NotNull UserRequest request);

    @GET
    @Path("/{id}/balances")
    @Produces(MediaType.APPLICATION_JSON)
    Response getBalances(@PathParam("id") String id);

}
