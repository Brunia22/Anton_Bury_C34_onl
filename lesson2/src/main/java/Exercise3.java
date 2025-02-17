
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args){

        System.out.println("Enter two number");

        Scanner scanner1 = new Scanner(System.in);

        Scanner scanner2 = new Scanner(System.in);

        int number1 =  scanner1.nextInt();
        int number2 =  scanner2.nextInt();

        int number3 = (number1 + number2)/2;
        System.out.println("Arithmetic mean:" + number3);


    }
}

