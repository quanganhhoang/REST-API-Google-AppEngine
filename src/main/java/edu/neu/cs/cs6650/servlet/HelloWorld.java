package edu.neu.cs.cs6650.servlet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/hello")
public class HelloWorld {
  @GET // annotate method with http annotation
  @Produces(MediaType.APPLICATION_JSON) // specify response format
  public Response hello() {
    String msg = "hello world";

    return Response.ok(msg)
        .type(MediaType.APPLICATION_JSON)
        .build();
  }
}
