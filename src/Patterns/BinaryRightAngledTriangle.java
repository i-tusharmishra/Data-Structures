package Patterns;

import java.util.Scanner;

public class BinaryRightAngledTriangle {
    public static void main(String[] args) {
        /* This program takes input a number n and.
        Prints a BINARY RIGHT ANGLED TRIANGLE in n rows
        where even rows starts with 1 and odd with 0 (row count starts from 0).
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i=0; i<n; i++) {
            int start = 1;
            if (i % 2 != 0) {start = 0;}

            for (int j=0; j<=i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }
}
