
package ru.naztrans.elcom.webclientclasses;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.naztrans.elcom.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResultDTO_QNAME = new QName("http://webclientclasses.elcom.naztrans.ru/", "resultDTO");
    private final static QName _GetProductByNameResponse_QNAME = new QName("http://webclientclasses.elcom.naztrans.ru/", "getProductByNameResponse");
    private final static QName _AddProductResponse_QNAME = new QName("http://webclientclasses.elcom.naztrans.ru/", "addProductResponse");
    private final static QName _GetProductByIdResponse_QNAME = new QName("http://webclientclasses.elcom.naztrans.ru/", "getProductByIdResponse");
    private final static QName _GetProductListByCatId_QNAME = new QName("http://webclientclasses.elcom.naztrans.ru/", "getProductListByCatId");
    private final static QName _ProductDTO_QNAME = new QName("http://webclientclasses.elcom.naztrans.ru/", "productDTO");
    private final static QName _GetProductById_QNAME = new QName("http://webclientclasses.elcom.naztrans.ru/", "getProductById");
    private final static QName _RemoveProductById_QNAME = new QName("http://webclientclasses.elcom.naztrans.ru/", "removeProductById");
    private final static QName _GetProductListResponse_QNAME = new QName("http://webclientclasses.elcom.naztrans.ru/", "getProductListResponse");
    private final static QName _AddProduct_QNAME = new QName("http://webclientclasses.elcom.naztrans.ru/", "addProduct");
    private final static QName _RemoveProductByIdResponse_QNAME = new QName("http://webclientclasses.elcom.naztrans.ru/", "removeProductByIdResponse");
    private final static QName _Ping_QNAME = new QName("http://webclientclasses.elcom.naztrans.ru/", "ping");
    private final static QName _GetProductListByCatIdResponse_QNAME = new QName("http://webclientclasses.elcom.naztrans.ru/", "getProductListByCatIdResponse");
    private final static QName _GetProductByName_QNAME = new QName("http://webclientclasses.elcom.naztrans.ru/", "getProductByName");
    private final static QName _GetProductList_QNAME = new QName("http://webclientclasses.elcom.naztrans.ru/", "getProductList");
    private final static QName _PingResponse_QNAME = new QName("http://webclientclasses.elcom.naztrans.ru/", "pingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.naztrans.elcom.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemoveProductById }
     * 
     */
    public RemoveProductById createRemoveProductById() {
        return new RemoveProductById();
    }

    /**
     * Create an instance of {@link GetProductListResponse }
     *
     */
    public GetProductListResponse createGetProductListResponse() {
        return new GetProductListResponse();
    }

    /**
     * Create an instance of {@link RemoveProductByIdResponse }
     *
     */
    public RemoveProductByIdResponse createRemoveProductByIdResponse() {
        return new RemoveProductByIdResponse();
    }

    /**
     * Create an instance of {@link AddProduct }
     *
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link Ping }
     *
     */
    public Ping createPing() {
        return new Ping();
    }

    /**
     * Create an instance of {@link ResultDTO }
     *
     */
    public ResultDTO createResultDTO() {
        return new ResultDTO();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     *
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link GetProductByNameResponse }
     *
     */
    public GetProductByNameResponse createGetProductByNameResponse() {
        return new GetProductByNameResponse();
    }

    /**
     * Create an instance of {@link ProductDTO }
     *
     */
    public ProductDTO createProductDTO() {
        return new ProductDTO();
    }

    /**
     * Create an instance of {@link GetProductByIdResponse }
     *
     */
    public GetProductByIdResponse createGetProductByIdResponse() {
        return new GetProductByIdResponse();
    }

    /**
     * Create an instance of {@link GetProductListByCatId }
     *
     */
    public GetProductListByCatId createGetProductListByCatId() {
        return new GetProductListByCatId();
    }

    /**
     * Create an instance of {@link GetProductById }
     *
     */
    public GetProductById createGetProductById() {
        return new GetProductById();
    }

    /**
     * Create an instance of {@link GetProductByName }
     *
     */
    public GetProductByName createGetProductByName() {
        return new GetProductByName();
    }

    /**
     * Create an instance of {@link GetProductListByCatIdResponse }
     *
     */
    public GetProductListByCatIdResponse createGetProductListByCatIdResponse() {
        return new GetProductListByCatIdResponse();
    }

    /**
     * Create an instance of {@link GetProductList }
     *
     */
    public GetProductList createGetProductList() {
        return new GetProductList();
    }

    /**
     * Create an instance of {@link PingResponse }
     *
     */
    public PingResponse createPingResponse() {
        return new PingResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultDTO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://service.elcom.naztrans.ru/", name = "resultDTO")
    public JAXBElement<ResultDTO> createResultDTO(ResultDTO value) {
        return new JAXBElement<ResultDTO>(_ResultDTO_QNAME, ResultDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductByNameResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://service.elcom.naztrans.ru/", name = "getProductByNameResponse")
    public JAXBElement<GetProductByNameResponse> createGetProductByNameResponse(GetProductByNameResponse value) {
        return new JAXBElement<GetProductByNameResponse>(_GetProductByNameResponse_QNAME, GetProductByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://service.elcom.naztrans.ru/", name = "addProductResponse")
    public JAXBElement<AddProductResponse> createAddProductResponse(AddProductResponse value) {
        return new JAXBElement<AddProductResponse>(_AddProductResponse_QNAME, AddProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductByIdResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://service.elcom.naztrans.ru/", name = "getProductByIdResponse")
    public JAXBElement<GetProductByIdResponse> createGetProductByIdResponse(GetProductByIdResponse value) {
        return new JAXBElement<GetProductByIdResponse>(_GetProductByIdResponse_QNAME, GetProductByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductListByCatId }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://service.elcom.naztrans.ru/", name = "getProductListByCatId")
    public JAXBElement<GetProductListByCatId> createGetProductListByCatId(GetProductListByCatId value) {
        return new JAXBElement<GetProductListByCatId>(_GetProductListByCatId_QNAME, GetProductListByCatId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDTO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://service.elcom.naztrans.ru/", name = "productDTO")
    public JAXBElement<ProductDTO> createProductDTO(ProductDTO value) {
        return new JAXBElement<ProductDTO>(_ProductDTO_QNAME, ProductDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductById }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://service.elcom.naztrans.ru/", name = "getProductById")
    public JAXBElement<GetProductById> createGetProductById(GetProductById value) {
        return new JAXBElement<GetProductById>(_GetProductById_QNAME, GetProductById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveProductById }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://service.elcom.naztrans.ru/", name = "removeProductById")
    public JAXBElement<RemoveProductById> createRemoveProductById(RemoveProductById value) {
        return new JAXBElement<RemoveProductById>(_RemoveProductById_QNAME, RemoveProductById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductListResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://service.elcom.naztrans.ru/", name = "getProductListResponse")
    public JAXBElement<GetProductListResponse> createGetProductListResponse(GetProductListResponse value) {
        return new JAXBElement<GetProductListResponse>(_GetProductListResponse_QNAME, GetProductListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.elcom.naztrans.ru/", name = "addProduct")
    public JAXBElement<AddProduct> createAddProduct(AddProduct value) {
        return new JAXBElement<AddProduct>(_AddProduct_QNAME, AddProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveProductByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.elcom.naztrans.ru/", name = "removeProductByIdResponse")
    public JAXBElement<RemoveProductByIdResponse> createRemoveProductByIdResponse(RemoveProductByIdResponse value) {
        return new JAXBElement<RemoveProductByIdResponse>(_RemoveProductByIdResponse_QNAME, RemoveProductByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.elcom.naztrans.ru/", name = "ping")
    public JAXBElement<Ping> createPing(Ping value) {
        return new JAXBElement<Ping>(_Ping_QNAME, Ping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductListByCatIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.elcom.naztrans.ru/", name = "getProductListByCatIdResponse")
    public JAXBElement<GetProductListByCatIdResponse> createGetProductListByCatIdResponse(GetProductListByCatIdResponse value) {
        return new JAXBElement<GetProductListByCatIdResponse>(_GetProductListByCatIdResponse_QNAME, GetProductListByCatIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.elcom.naztrans.ru/", name = "getProductByName")
    public JAXBElement<GetProductByName> createGetProductByName(GetProductByName value) {
        return new JAXBElement<GetProductByName>(_GetProductByName_QNAME, GetProductByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.elcom.naztrans.ru/", name = "getProductList")
    public JAXBElement<GetProductList> createGetProductList(GetProductList value) {
        return new JAXBElement<GetProductList>(_GetProductList_QNAME, GetProductList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.elcom.naztrans.ru/", name = "pingResponse")
    public JAXBElement<PingResponse> createPingResponse(PingResponse value) {
        return new JAXBElement<PingResponse>(_PingResponse_QNAME, PingResponse.class, null, value);
    }

}
