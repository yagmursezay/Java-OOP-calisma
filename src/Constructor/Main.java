package Constructor;


public class Main {
    public static void main(String[] args) {
        Constructor.Product product = new Constructor.Product(1, "laptop", "asus", 5000, 3, "kırmızı");

        //Product Product = new Product();
        //product.setName("Laptop");
        //product.setId(1);
        //product.setDescription("Asus Laptop");
        //product.setPrice(5000);
        //product.setStockAmount(3);


        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());

    }
}