package com.company.service;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/number")
public class NumbersService {
    @POST
    @Path("/{num1}/{num2}")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response getSum(@PathParam("num2") int num2, @PathParam("num1") int num1){
        return Response.ok().entity(num1 + num2).build();
    }


}
