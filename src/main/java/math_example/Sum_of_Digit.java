package math_example;
import java.util.Scanner;
public class Sum_of_Digit {

    public static void main(String[] args) {
        //------------------------------------
        Scanner input = new Scanner(System.in);

        int q, multiplication = 0;
        System.out.print("Enter the last number : ");
        q = input.nextInt();

        for (int i = 1; i <= q; i = i + 1) {
            System.out.print(i + "x" + i + " ");
            multiplication = multiplication + i * i;
        }
        System.out.println();
        System.out.println("= " + multiplication);
        //------------------------------------
        //series_1*1 + 2*2 + 3*3 + .................+n তম পদ
    }
}
