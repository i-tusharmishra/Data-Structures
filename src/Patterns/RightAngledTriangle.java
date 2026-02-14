package Patterns;

import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        /* This code take a number n as input from the user,
        and Prints a Right Angled Triangle of same height. */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
