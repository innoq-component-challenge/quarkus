package com.innoq.compchallenge.quarkus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;

@Path("/")
public class HomeResource {

    @CheckedTemplate
    public static class Templates {
        public static native TemplateInstance home(); 
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance hello() {
        return Templates.home();
    }
}