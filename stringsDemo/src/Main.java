import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String message = "Bugün hava çok güzel.";
        System.out.println(message);

        System.out.println("Eleman sayısı: " + message.length());
        System.out.println("5. eleman: " + message.charAt(4));
        System.out.println(message.concat(" Yaşasın!"));
        System.out.println(message.startsWith("C"));
        System.out.println(message.endsWith("."));

        char[] characters = new char[10];
        message.getChars(0,10,characters,0);
        System.out.println(characters);
        System.out.println(message.indexOf("a"));
        System.out.println(message.lastIndexOf("a"));

        String newMessage = message.replace("ü","u");
        System.out.println(newMessage);

        System.out.println("SubString ---------------------");
        System.out.println(message.substring(2,5));

        System.out.println("Split ---------------------");
        for (String sentence : message.split(" ")){
            System.out.println(sentence);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        System.out.println(message.trim()); //Başındaki ve sonundaki boşlukları atar.
    }
}
