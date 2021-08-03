import jdk.swing.interop.SwingInterOpUtils;

public class ProductManager {
    public void Add(Product product){
        //JDBC
        System.out.println("Ürün eklendi: "+ product.getKod());
    }

    public void Add2 (int id, String name, String description, double stockAmound, double price){

    }
}
