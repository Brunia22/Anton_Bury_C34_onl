import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args){

        System.out.println("Enter number");

        Scanner scanner = new Scanner(System.in);

        int number1 =  scanner.nextInt();
        int value1 =0;

        while(number1 % 10 == 0){

            number1 = number1 / 10;

            value1= value1 + 1;
        }
        System.out.println("Number of zeros:" + value1);


    }
}

