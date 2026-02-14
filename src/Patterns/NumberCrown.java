package Patterns;

import java.util.Scanner;

public class NumberCrown {
    public static void main(String[] args) {
        /* This program take a number n input from user, and
        Prints a NUMBER CROWN in n rows.
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int space = 2 * (n-1);
        for (int i=1; i<=n; i++) {
            //Numbers
            for (int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }

            //Spaces
            for (int k=1; k<=space; k++) {
                System.out.print("  ");
            }

            //Numbers
            for (int l=i; l>=1; l--) {
                System.out.print(l + " ");
            }

            System.out.println();
            space -= 2;
        }
    }
}
