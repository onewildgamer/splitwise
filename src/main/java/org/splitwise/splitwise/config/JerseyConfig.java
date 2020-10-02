package org.splitwise.splitwise.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.splitwise.splitwise.impl.ApplicationCheckImpl;
import org.splitwise.splitwise.impl.ExpensesImpl;
import org.splitwise.splitwise.impl.UsersImpl;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

@Configuration
@ApplicationPath("/v1/splitwise/")
public class JerseyConfig extends ResourceConfig {

    @PostConstruct
    public void init() {
        register(UsersImpl.class);
        register(ExpensesImpl.class);
        register(ApplicationCheckImpl.class);
    }
}
