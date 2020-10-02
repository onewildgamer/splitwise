package org.splitwise.splitwise.impl;

import org.splitwise.splitwise.api.ApplicationCheck;

import javax.ws.rs.core.Response;

public class ApplicationCheckImpl implements ApplicationCheck {

    @Override
    public Response greet() {
        return Response.ok("Hello, the application is working").build();
    }
}
