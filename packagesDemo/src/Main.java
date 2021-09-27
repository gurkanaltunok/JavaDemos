import matematik.*;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Your name: ");

        String name = scanner.nextLine();

        System.out.println("Hello "+name);

        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.Topla(6,18));

        Logaritma logaritma = new Logaritma();
    }
}
