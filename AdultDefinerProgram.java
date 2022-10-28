package FirstStepsInCoding;

import java.util.Scanner;

public class AdultDefinerProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        
        if (age>18 && age<100) {
            System.out.println("You are an adult");
        }
        else if (age<18){
            System.out.println("You are not an adult");
        }
    }
}
