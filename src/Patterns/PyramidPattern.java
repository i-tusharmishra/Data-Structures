package Patterns;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        /* This program takes a number n as input and,
        Print a PYRAMID PATTERN in n rows. */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

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
    }
}
