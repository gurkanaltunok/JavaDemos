import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        System.out.println(numbers.size());
        numbers.add(1);
        numbers.add(10);
        numbers.add("Istanbul");
        System.out.println(numbers.size());
        System.out.println(numbers.get(2));
        //numbers.set(2,15);
        //System.out.println(numbers.get(2));
        //numbers.remove(0);
        //System.out.println(numbers.get(0));
        //numbers.clear();

        for (Object i:numbers){
            System.out.println(i);
        }
    }
}
