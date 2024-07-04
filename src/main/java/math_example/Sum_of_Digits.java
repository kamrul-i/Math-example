package math_example;
import java.util.Scanner;
public class Sum_of_Digits {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            // input by Even number print--------------------
            int sum = 0;
            int m, n;
            System.out.print("Enter initial/first number : ");
            m = input.nextInt();

            System.out.print("Enter final/last number : ");
            n = input.nextInt();

            for (int i = m; i <= n; i++) {
                if (i % 2 == 0) {
                    sum = sum + i;
                    System.out.println(i);
                }
            }
            System.out.println("The sum of even number's is : " + sum);
            // input by Even number print--------------------
        }
    }
}
