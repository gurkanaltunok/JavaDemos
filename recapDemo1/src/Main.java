public class Main {

    public static void main(String[] args) {
        int number1 = 38;
        int number2 = 35;
        int number3 = 29;
        
        int biggestNumber = 0;
        
        if (number1>=number3 & number1>=number2){
            biggestNumber = number1;
        }else if (number2>=number1 & number2>=number3) {
            biggestNumber = number2;
        }else{
            biggestNumber = number3;
        }
        System.out.println("En büyük sayı: "+biggestNumber);
    }
}
