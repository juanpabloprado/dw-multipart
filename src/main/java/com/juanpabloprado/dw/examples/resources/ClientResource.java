package com.juanpabloprado.dw.examples.resources;

import com.juanpabloprado.dw.examples.views.FileView;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by Juan on 25/02/2015.
 */
@Path("/client")
@Produces(MediaType.TEXT_HTML)
@Consumes(MediaType.APPLICATION_JSON)
public class ClientResource {

    @GET
    @Path("/uploadFile")
    public FileView uploadFile() {
        return new FileView();
    }
}
