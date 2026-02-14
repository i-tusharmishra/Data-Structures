package Patterns;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        /* This program takes a number n as input and,
        Print a DIAMOND PATTERN in 2n rows. */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // For upper half of the diamond.
        for (int i=0; i<n; i++) {
            //Initial Spaces
            for (int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            //Stars
            for (int k=0; k<2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // For lower half of the pyramid.
        for (int i=0; i<n; i++) {
            //Initial Spaces
            for (int j=0; j<i; j++) {
                System.out.print(" ");
            }
            //Stars, Formula = 2 * (n-i) - 1
            for (int k=0; k<2*(n-i)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
