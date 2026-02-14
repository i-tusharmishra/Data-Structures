package Patterns;

import java.util.Scanner;

public class DecreasingNumberTriangle {
    public static void main(String[] args) {
        /* This code takes a number n input from user.
        and Prints a DECREASING NUMBER PATTERN (column based) till n in n rows.
        Example: Input = 3
                 1 2 3
                 1 2
                 1
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i=n; i>0; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
