package math_example;
import java.util.Scanner;
public class Multiplication_of_Digit {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            //namota magic.............................................
            int num;
            System.out.print("Enter any number : ");
            num = input.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + num * i);
            }
            //---------------------------------------------------------
        }
    }
}
