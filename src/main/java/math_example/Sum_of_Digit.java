package math_example;
import java.util.Scanner;
public class Sum_of_Digit {

    public static void main(String[] args) {
        //------------------------------------
        Scanner input = new Scanner(System.in);

        double p, number = 0;
        System.out.print("Enter the last number : ");
        p = input.nextDouble();

        for (double i = 1.5; i <= p; i++) {
            number = number + i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("= " + number);
        //------------------------------------
        //series_1.5+2.5+3.5+...............+n তম পদ 

    }
}
