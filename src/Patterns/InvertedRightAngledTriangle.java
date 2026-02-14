package Patterns;

import java.util.Scanner;

public class InvertedRightAngledTriangle {
    public static void main(String[] args) {
        /* This code take a number n as input from the user,
        and Prints a Inverted Right Angled Triangle of same height. */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i=n; i>0; i--) {
            for (int j=i; j>0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
