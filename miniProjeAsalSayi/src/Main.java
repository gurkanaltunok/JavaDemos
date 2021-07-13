public class Main {

    public static void main(String[] args) {
	    int number = 17;
	    boolean isPrime = true;

	    int i = 2;

	    if (number>1){
            while (i < number){
                if (number % i == 0){
                    isPrime = false;
                    System.out.println("Asal değil, "+ i +" sayısına bölünüyor");
                    break;
                }
                i++;
            }
            if (isPrime == true){
                System.out.println("Asal");
            }
        }else if(number==1){
            System.out.println("Asal değil");
        }else{
            System.out.println("Negatif sayılarda asallık aranmaz.");

        }

    }
}
