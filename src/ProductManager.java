public class ProductManager {

    public void Add(Product product){

       // System.out.println("Product Added: "+ product.name);
        System.out.println(product.getKod()+" - "+product.getPrice()+"TL");
    }
}
