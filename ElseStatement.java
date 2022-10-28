package FirstStepsInCoding;

import java.util.Scanner;

public class ElseStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number here: ");
        int number =scanner.nextInt();

        if (number<50){
            System.out.println("Your number is smaller than fifty");
        }


        else{
            System.out.println("Your number is bigger than fifty");
        }

    }
}
