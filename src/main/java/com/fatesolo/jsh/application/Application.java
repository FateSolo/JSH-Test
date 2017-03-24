package com.fatesolo.jsh.application;

import com.fatesolo.jsh.resource.BookResource;
import org.glassfish.jersey.server.ResourceConfig;

public class Application extends ResourceConfig {

    public Application() {
        register(BookResource.class);
    }

}
