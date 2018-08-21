package ru.naztrans.elcom.service;

import ru.naztrans.elcom.dao.CategoryDAO;
import ru.naztrans.elcom.dao.ProductDAO;
import ru.naztrans.elcom.dto.ProductDTO;
import ru.naztrans.elcom.dto.ResultDTO;
import ru.naztrans.elcom.entity.Category;
import ru.naztrans.elcom.entity.Product;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@WebService
@Path("/ProductService")
public class ProductService {

    @Inject
    ProductDAO productDAO;
    @Inject
    CategoryDAO categoryDAO;

    @GET
    @WebMethod
    @Path("/ping")
    @Produces(MediaType.APPLICATION_JSON)
    public ResultDTO ping() {
        return new ResultDTO();
    }

    @POST
    @WebMethod(operationName = "addProduct")
    @Path("/addProduct")
    @Produces(MediaType.APPLICATION_JSON)
    public ResultDTO createCategory(
            @FormParam(value = "name")
            @WebParam(name = "name")
            final String name,

            @FormParam(value = "desc")
            @WebParam(name = "desc")
            final String description,

            @FormParam(value="catId")
            @WebParam(name = "catId")
            final String catId

    )

    {
        Product product = new Product();
        product.setName(name);
        product.setDescription(description);
        if (catId!=null || !catId.isEmpty()){
            Category cat = categoryDAO.getCatById(catId);
            if (cat!=null) product.setCategory(cat);
        }

        productDAO.persist(product);
        return new ResultDTO("Добавлен продукт id= " + product.getId());
    }

    @GET
    @WebMethod(operationName = "removeProductById")
    @Path("/removeProductById")
    @Produces(MediaType.APPLICATION_JSON)
    public ResultDTO removeProductById(
            @QueryParam(value = "id")
            @WebParam(name="id")
            final String id
    ){
       try {
           productDAO.removeProductById(id);
           return new ResultDTO();
       }
       catch (Exception e){
           return new ResultDTO(false, e.getMessage());
       }
    }

    @GET
    @WebMethod(operationName = "getProductById")
    @Path("/getProductById")
    @Produces(MediaType.APPLICATION_JSON)
    public ProductDTO getProductById(
            @QueryParam(value = "id")
            @WebParam(name="id")
            final String id
    ){
        Product product = productDAO.getProductById(id);
        if (product==null) return null;
        return new ProductDTO(product);
    }

    @GET
    @WebMethod(operationName = "getProductByName")
    @Path("/getProductByName")
    @Produces(MediaType.APPLICATION_JSON)
    public ProductDTO getProductByName(
            @QueryParam(value = "name")
            @WebParam(name="name")
            final String name
    ){
        Product product = productDAO.getProductByName(name);
        if (product==null) return null;
        return new ProductDTO(product);
    }

    @GET
    @WebMethod(operationName = "getProductList")
    @Path("/getProductList")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProductDTO> getProductByList(){
        return productDAO.getProducts().stream().map(ProductDTO::new).collect(Collectors.toList());
    }

    @GET
    @WebMethod(operationName = "getProductListByCatId")
    @Path("/getProductListByCatId")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProductDTO> getProductByListByCatId(
            @QueryParam(value = "id")
            @WebParam(name="id")
            final String id
    ){
        return productDAO.getProductFromCategory(id).stream().map(ProductDTO::new).collect(Collectors.toList());
    }
}
