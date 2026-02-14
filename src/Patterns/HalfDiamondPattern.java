package Patterns;

import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        /* This program takes a number n as input and,
        Print a HALF DIAMOND PATTERN */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        //Upper Half
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Lower Half
        for (int i=n-1; i>0; i--) {
            for (int j=i; j>0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
