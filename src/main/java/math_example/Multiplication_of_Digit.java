package math_example;
import java.util.Scanner;
public class Multiplication_of_Digit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m, multiplication = 1;
        System.out.print("Enter the last number : ");
        m = input.nextInt();

        for (int i = 1; i <= m; i++) {
            System.out.print(i + " ");
            multiplication = multiplication * i;
        }
        System.out.println();
        System.out.println(m + " টি সংখ্যার গুণফল" + " = " + multiplication);
    }
    //series_1*2*3*4*5*..........................*m
}
