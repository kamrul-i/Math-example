package math_example;
import java.util.Scanner;
public class Multiplication_of_Digit {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            double p, multiplication = 1;
            System.out.print("Enter the last number : ");
            p = input.nextDouble();

            for (double i = 1.5; i <= p; i++) {
                System.out.print(i + " ");
                multiplication = multiplication * i;
            }
            System.out.printf("\n");
            System.out.print(p + " এর মধ্যে দশমিক সংখ্যাগুলোর গুণফল = "+multiplication);
            //System.out.printf("%.2f", multiplication);
        }
        //series_1.5 * 2.5 * 3.5 * .................*p
    }
}
