
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args){

        System.out.println("Enter a positive number of type int");

        Scanner scanner = new Scanner(System.in);

        int number1 =  scanner.nextInt();
        int value1 =1;

        for(int i = 1;i < number1+1; i++){

            value1 = value1 * i;


        }
        System.out.println("The interval is:" + value1);


    }
}
