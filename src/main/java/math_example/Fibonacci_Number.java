package math_example;
import java.util.Scanner;
public class Fibonacci_Number {

    public static void main(String[] args) {
        //-----------------------------------------------------
        try (Scanner input = new Scanner(System.in)) {

            int first = 0;
            int second = 1;
            int fibo;
            System.out.print("How many numbers show ? ");
            int n = input.nextInt();

            System.out.print(first + " " + second);

            for (int i = 3; i <= n; i++) {
                fibo = first + second;
                System.out.print(" " + fibo);
                first = second;
                second = fibo;
            }
        }
        //------------------------------------------------------
        // The sum of Fibonacci  [0 1 1 2 3 5 8 13 21 34 55  ...... n]
        // Fibonacci মানে হলো প্রত্যেকটি সংখ্যা তার আগের দুটি সংখ্যার যোগফল ।।
    }
}
