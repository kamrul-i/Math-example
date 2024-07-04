package math_example;
import java.util.Scanner;
public class Sum_of_Digits {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // input by Odd number print------------
            int num = 0;
            int a, b;
            System.out.print("Enter first number : ");
            a = input.nextInt();

            System.out.print("Enter last number : ");
            b = input.nextInt();

            for (int i = a; i <= b; i++) {

                if (i % 2 != 0) {
                    num = num + i;
                    System.out.println(i);
                }
            }
            System.out.print("Odd number is : " + num);
            // input by Odd number print---------------
        }
    }
}
