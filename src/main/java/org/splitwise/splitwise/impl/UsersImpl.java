package org.splitwise.splitwise.impl;

import org.splitwise.splitwise.api.Users;
import org.splitwise.splitwise.model.UserRequest;
import org.springframework.stereotype.Controller;

import javax.validation.constraints.NotNull;
import javax.ws.rs.core.Response;

@Controller
public class UsersImpl implements Users {

    @Override
    public Response createUser(@NotNull UserRequest request) {
        return null;
    }

    @Override
    public Response getBalances(String id) {
        return null;
    }
}
