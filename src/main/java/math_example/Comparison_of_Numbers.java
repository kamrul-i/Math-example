package math_example;

import java.util.Scanner;

public class Comparison_of_Numbers {

    public static void main(String[] args) {

        //compare 02 numbers in java =========
        Scanner input = new Scanner(System.in);
        
        double num1, num2, large;
        System.out.print("Enter First number : ");
        num1 = input.nextDouble();
        
        System.out.print("Enter second number : ");
        num2 = input.nextDouble();

        large = (num1 > num2) ? num1 : num2;
        System.out.print("Large number is : " + large);

    }
    //'double' or 'float' use করলে decimal result দেখতে পাবে।।
    //’int’ use করলে পূর্ণ সংখ্যার result দেখতে পাবে।।
}
