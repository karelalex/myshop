package ru.naztrans.elcom.webclientclasses;



public class SampleClient {

    private static ProductServiceService service = new ProductServiceService();

    public static void main(String[] args) {
        if(service==null) System.out.println("жопа");
        ProductService port = service.getProductServicePort();
        for (ProductDTO product : port.getProductList()){
            System.out.println(product.name);
            System.out.println(product.description);
            System.out.println();
        }
    }
}
