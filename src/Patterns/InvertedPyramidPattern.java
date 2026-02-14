package Patterns;

import java.util.Scanner;

public class InvertedPyramidPattern {
    public static void main(String[] args) {
        /* This program takes a number n as input and,
        Print a INVERTED PYRAMID PATTERN in n rows. */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i=0; i<n; i++) {
            //Initial Spaces
            for (int j=0; j<=i; j++) {
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
