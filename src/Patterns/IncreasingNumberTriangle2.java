package Patterns;

import java.util.Scanner;

public class IncreasingNumberTriangle2 {
    public static void main(String[] args) {
        /* This code takes a number n input from user.
        and Prints a INCREASING NUMBER PATTERN (row based) till n in n rows.
        Example: Input = 3
                 1
                 2 2
                 3 3 3
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i=1; i<=n; i++) {
            for (int j=0; j<i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
