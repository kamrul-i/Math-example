package math_example;
import java.util.Scanner;
public class Sum_of_Digit {

    public static void main(String[] args) {
        //--------------------------------------
        Scanner input = new Scanner(System.in);

        int m, sum = 0;
        System.out.print("Enter the last number : ");
        m = input.nextInt();

        for (int i = 1; i <= m; i++) {
            System.out.println(i + " ");
            sum = sum + i;
        }
        //System.out.printf("\n");
        System.out.println(" = " + sum);
        //--------------------------------------
        //series_1+2+3+.............+m
    }
}
