package com.company.pattern;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args)
    {
        /*int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i, j, k = 0;
        for (i = 1; i <= n; i++)
        {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            while (k != (2 * i-1)) {
            if (k == 0 || k == 2 * i-2)
            System.out.print("*");
else
            System.out.print(" ");
            k++;

        }
            k = 0;
            System.out.println(); // print next row
        }
        for (i = 0; i < 2 * n-1; i++) {
        System.out.print("*");
    }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int rows= sc.nextInt();
        int x=rows;
        int y=rows;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<rows*2;j++){
                if(j==x||j==y||i==rows)
                {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            x--;y++;
            System.out.println();
        }
    }

}
