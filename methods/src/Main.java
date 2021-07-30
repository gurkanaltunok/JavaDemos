public class Main {

    public static void main(String[] args) {
        sayiBulmaca(2);
        sayiBulmaca(4);
        sayiBulmaca(7);
        sayiBulmaca(12);

    }

    public static void sayiBulmaca (int number) {
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = number;
        boolean varMi=false;

        for (int sayi : sayilar){
            if (sayi==aranacak){
                varMi = true;
                break;
            }
        }

        String mesaj = "";

        if (varMi){
            mesaj = "sayı mevcut: " + aranacak;
            mesajVer(mesaj);
        }else {
            System.out.println("Sayı mevcut değil: " + aranacak);
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}
