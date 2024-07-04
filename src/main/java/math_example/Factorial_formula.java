package math_example;

import java.util.Scanner;

public class Factorial_formula {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int num, fact = 1;
            System.out.print("Enter any positive number : ");
            num = input.nextInt();

            for (int i = num; i >= 1; i--) {
                fact = fact * i;
                System.out.print(i + " ");
            }
            System.out.printf("\n");
            System.out.print("This number's factorial is : " + fact);

            //factorial-মানে হলো,যে সংখ্যা input দিবেন, সেটা সহ তার পূর্ববর্তী সকল সংখ্যার গুণফল।।
            // imagine (5-ar factorial, 5! = 5*4*3*2*1 = 120
            // (10-ar factorial, 10! = 10*9*8*7*6*5*4*3*2*1 = 3628800 
        }
        //'double' or 'float' use করলে decimal result দেখতে পাবে।।
        //’int’ use করলে পূর্ণ সংখ্যার result দেখতে পাবে।।

    }

}
