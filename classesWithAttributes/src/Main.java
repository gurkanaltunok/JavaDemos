public class Main {

    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Asus Laptop",5000,3,"Gri");


//        Product product = new Product();
//        product.setId(1);
//        product.setName("Laptop");
//        product.setDescription("Asus Laptop");
//        product.setPrice(5000);
//        product.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

    }
}
