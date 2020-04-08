package HomeworkLesson1Titarchuk;

import java.util.Scanner;

public class Titarchuk_MaxInt {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter three different numbers: ");
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();

        if (a>b && a>c){
            System.out.println("Max number is: " + a);
        } else if (b>a && b>c){
            System.out.println("Max number is: " + b);
        } else if (a == b || b == c || c == a){
            System.out.println("Enter different numbers");
        } else if (c>a && c>b){
            System.out.println("Max number is: " + c);
        } else
            System.out.println("Enter different numbers");
    }
}
