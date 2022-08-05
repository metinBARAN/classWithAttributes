public class Main {

    public static void main(String[] args) {
	// write your code here

        // Alan olusturma yeri
        Product product = new Product();// Constructor
       product.setId(1);
       product.setName("Laptop");
       product.setDescription("Hp Laptop");
       product.setPrice(6500);
       product.setStockAmount(5);


        ProductManager productManager = new ProductManager();
        productManager.Add(product);


    }
}
