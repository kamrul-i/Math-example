package math_example;
import java.util.Scanner;
public class Multiplication_of_Digit {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            long n, multipli = 1;
            System.out.print("Enter the last number : ");
            n = input.nextInt();

            for (long i = 1; i <= n; i = i + 2) {
                System.out.print(i + " ");
                multipli = multipli * i;
            }
            System.out.println();
            System.out.println(n + " পর্যন্ত বিজোড় সংখ্যাগুলোর গুণফল = " + multipli);
        }
        //series_1*3*5*7*..............*n
    }
}