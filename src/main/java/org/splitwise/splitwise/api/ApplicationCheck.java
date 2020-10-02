package org.splitwise.splitwise.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("check")
public interface ApplicationCheck {

    @GET
    Response greet();
}
