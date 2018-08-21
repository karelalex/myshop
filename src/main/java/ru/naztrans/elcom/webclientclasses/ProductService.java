
package ru.naztrans.elcom.webclientclasses;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.List;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProductService", targetNamespace = "http://service.elcom.naztrans.ru/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductService {


    /**
     * 
     * @param name
     * @return
     *     returns ru.naztrans.elcom.service.ProductDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProductByName", targetNamespace = "http://service.elcom.naztrans.ru/", className = "ru.naztrans.elcom.service.GetProductByName")
    @ResponseWrapper(localName = "getProductByNameResponse", targetNamespace = "http://service.elcom.naztrans.ru/", className = "ru.naztrans.elcom.service.GetProductByNameResponse")
    public ProductDTO getProductByName(
            @WebParam(name = "name", targetNamespace = "")
                    String name);

    /**
     *
     * @param id
     * @return
     *     returns java.util.List<ru.naztrans.elcom.service.ProductDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProductListByCatId", targetNamespace = "http://service.elcom.naztrans.ru/", className = "ru.naztrans.elcom.service.GetProductListByCatId")
    @ResponseWrapper(localName = "getProductListByCatIdResponse", targetNamespace = "http://service.elcom.naztrans.ru/", className = "ru.naztrans.elcom.service.GetProductListByCatIdResponse")
    public List<ProductDTO> getProductListByCatId(
            @WebParam(name = "id", targetNamespace = "")
                    String id);

    /**
     *
     * @return
     *     returns java.util.List<ru.naztrans.elcom.service.ProductDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProductList", targetNamespace = "http://service.elcom.naztrans.ru/", className = "ru.naztrans.elcom.service.GetProductList")
    @ResponseWrapper(localName = "getProductListResponse", targetNamespace = "http://service.elcom.naztrans.ru/", className = "ru.naztrans.elcom.service.GetProductListResponse")
    public List<ProductDTO> getProductList();

    /**
     *
     * @param id
     * @return
     *     returns ru.naztrans.elcom.service.ProductDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProductById", targetNamespace = "http://service.elcom.naztrans.ru/", className = "ru.naztrans.elcom.service.GetProductById")
    @ResponseWrapper(localName = "getProductByIdResponse", targetNamespace = "http://service.elcom.naztrans.ru/", className = "ru.naztrans.elcom.service.GetProductByIdResponse")
    public ProductDTO getProductById(
            @WebParam(name = "id", targetNamespace = "")
                    String id);

    /**
     *
     * @param id
     * @return
     *     returns ru.naztrans.elcom.service.ResultDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "removeProductById", targetNamespace = "http://service.elcom.naztrans.ru/", className = "ru.naztrans.elcom.service.RemoveProductById")
    @ResponseWrapper(localName = "removeProductByIdResponse", targetNamespace = "http://service.elcom.naztrans.ru/", className = "ru.naztrans.elcom.service.RemoveProductByIdResponse")
    public ResultDTO removeProductById(
            @WebParam(name = "id", targetNamespace = "")
                    String id);

    /**
     *
     * @param catId
     * @param name
     * @param desc
     * @return
     *     returns ru.naztrans.elcom.service.ResultDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addProduct", targetNamespace = "http://service.elcom.naztrans.ru/", className = "ru.naztrans.elcom.service.AddProduct")
    @ResponseWrapper(localName = "addProductResponse", targetNamespace = "http://service.elcom.naztrans.ru/", className = "ru.naztrans.elcom.service.AddProductResponse")
    public ResultDTO addProduct(
            @WebParam(name = "name", targetNamespace = "")
                    String name,
            @WebParam(name = "desc", targetNamespace = "")
                    String desc,
            @WebParam(name = "catId", targetNamespace = "")
                    String catId);

    /**
     * 
     * @return
     *     returns ru.naztrans.elcom.service.ResultDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ping", targetNamespace = "http://service.elcom.naztrans.ru/", className = "ru.naztrans.elcom.service.Ping")
    @ResponseWrapper(localName = "pingResponse", targetNamespace = "http://service.elcom.naztrans.ru/", className = "ru.naztrans.elcom.service.PingResponse")
    public ResultDTO ping();

}
