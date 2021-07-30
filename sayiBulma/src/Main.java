public class Main {

    public static void main(String[] args) {
	    int[] numbers = new int[]{1,2,5,7,9,0};
	    int aranacak =4;
	    boolean varMi = false;
	    for (int i = 0;i<=aranacak;i++){
	        if (numbers[i] == aranacak){
                varMi = true;
            }
        }
	    if (varMi == true){
            System.out.println("Aranan sayı dizide var");
        }else {
            System.out.println("Aranan sayı dizide yok");
        }
    }
}
