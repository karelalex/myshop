package ru.naztrans.elcom.service;

import ru.naztrans.elcom.dao.CategoryDAO;
import ru.naztrans.elcom.dto.ResultDTO;
import ru.naztrans.elcom.entity.Category;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@WebService
@Path("/CategoryService")
public class CategoryService {
    @Inject
    CategoryDAO categoryDAO;

    @GET
    @WebMethod
    @Path("/ping")
    @Produces(MediaType.APPLICATION_JSON)
    public ResultDTO ping(){
        return new ResultDTO();
    }

    @POST
    @Path("/createCategory")
    @WebMethod(operationName = "createCategory")
    @Produces(MediaType.APPLICATION_JSON)
    public ResultDTO createCategory(
        @FormParam(value = "name")
        @WebParam(name="name")
        final String name,

        @FormParam(value = "desc")
        @WebParam(name = "desc")
        final String description
    ){
        Category cat = new Category();
        cat.setName(name);
        cat.setDescription(description);
        categoryDAO.persist(cat);
        return new ResultDTO("Категория создана id= "+cat.getId());
    }

}
