import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    String message = "Bugün hava çok güzel.";
	    String newMessage = sehirVer();
        System.out.println(newMessage);
        int number = topla(8,13);
        System.out.println(number);
        int sum = topla2(2,6,3,2,10,32,14);
        System.out.println(sum);
    }

    public static void add() {
        System.out.println("Added");
    }

    public static void delete() {
        System.out.println("Deleted");
    }

    public static void update() {
        System.out.println("Updated");
    }

    public static int topla(int number1,int number2){
        return number1+number2;
    }

    public static int topla2(int... numbers){
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }

    public static String sehirVer(){
        return "Ankara";
    }
}
