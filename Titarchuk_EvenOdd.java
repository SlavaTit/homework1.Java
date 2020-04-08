package HomeworkLesson1Titarchuk;

import java.util.Scanner;

public class Titarchuk_EvenOdd {
    public static void main(String[] args) {
        Scanner digit = new Scanner(System.in);
        System.out.println("Enter any digit");
        int a = digit.nextInt();
        if (a%2 == 0) {
             System.out.println("Your number is Even: " + true);
        } else System.out.println("Your number is Even: "+ false);
    }
}
