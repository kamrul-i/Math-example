package math_example;
import java.util.Scanner;
public class Multiplication_of_Digit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m, n, multiplication = 1;
        System.out.print("Enter first number : ");
        m = input.nextInt();

        System.out.print("Enter last number : ");
        n = input.nextInt();

        for (int i = m; i <= n; i++) {

            if (i % 2 != 0) {
                System.out.print(i + " ");
                //System.out.println(i);
                multiplication = multiplication * i;
            }
        }
        System.out.println();
        System.out.println("The multiplication of odd number's is : " + multiplication);
    }
}
