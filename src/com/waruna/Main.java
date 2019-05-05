package com.waruna;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n, i, j, space = 1;
        System.out.print("Enter the number of rows: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        space = n - 1;
        for (j = 1; j <= n; j++)
        {
            for (i = 1; i <= space; i++)
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= n - 1; j++)
        {
            for (i = 1; i <= space; i++)
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (n - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        int a;
        int b;
        for (a=1; a<=9; ++a)
        {
            for (b=1; b<=9; ++b)
            {
                System.out.print(a*b+"   ");
            }
            System.out.println();
        }
    }



}
