public class Main {

    public static void main(String[] args) {
	    /*int number = 28;
	    int i = 1;
	    int toplam = 0;

	    while (number>i){
	        if (number%i == 0){
	            toplam = toplam + i;
            }
	        i = i+1;
        }

	    if (number == toplam){
            System.out.println("Mükemmel Sayı");
        }else{
            System.out.println("Mükemmel Sayı Değil");
        }*/

        int number = 6;
        int total = 0;

        for (int i=1;i<number;i++){
            if (number % i == 0){
                total = total + i;
            }
        }

        if (number == total){
            System.out.println("Mükemmel Sayı");
        }else{
            System.out.println("Mükemmel Sayı Değil");
        }
    }
}
