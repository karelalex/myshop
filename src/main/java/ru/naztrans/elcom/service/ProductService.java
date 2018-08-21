package ru.naztrans.elcom.service;

import ru.naztrans.elcom.dto.ResultDTO;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@WebService
@Path("/ProductService")
public class ProductService {
    @GET
    @WebMethod
    @Path("/ping")
    @Produces(MediaType.APPLICATION_JSON)
    public ResultDTO ping(){
        return new ResultDTO();
    }


}
