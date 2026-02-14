package Patterns;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        /* This code takes a number n input from user,
        and Prints a SQUARE PATTERN of n rows and n columns (n*n) */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print("* "); //Extra space is optional.
            }
            System.out.println();
        }
    }
}
