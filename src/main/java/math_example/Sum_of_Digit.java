package math_example;
import java.util.Scanner;
public class Sum_of_Digit {

    public static void main(String[] args) {
        //------------------------------------
        Scanner input = new Scanner(System.in);

        int n, num = 0;
        System.out.print("Enter the last number : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i = i + 2) {
            num = num + i;
            System.out.print(i + " ");
        }
        //System.out.println();
        System.out.println(" = " + num);
        //------------------------------------
        //series_1+3+5+................+n তম পদ

    }
}
