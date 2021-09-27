import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer gurkan = new Customer(1,"Gürkan","Altunok");
        customers.add(gurkan);
        customers.add(new Customer(2,"Engin","Demirog"));
        customers.add(new Customer(3,"Oğuz","Altunok"));

        customers.remove(gurkan);
        for (Customer customer:customers){
            System.out.println(customer.firstName + " " + customer.lastName);
        }
    }
}
