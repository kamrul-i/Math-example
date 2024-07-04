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
            System.out.print(i + " ");
            multiplication = multiplication * i;
        }
        System.out.println();
        System.out.println("The multiplication is : " + multiplication);
    }
}
