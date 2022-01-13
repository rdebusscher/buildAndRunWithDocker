package be.rubus.support.basic.rest;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


@Path("/hello")
@RequestScoped
public class HelloResource {

    @GET
    @Path("/{name}")
    public String sayHello(@PathParam("name") String name) {
        return String.format("Hello %s \n", name);
    }
}
