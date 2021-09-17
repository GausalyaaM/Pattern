package com.company.pattern;
import java.util.Scanner;
public class PascalTriangle {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=sc.nextInt();
        for(int i=1;i<=size;i++){
            for(int j=0;j<=size-i;j++){
                System.out.print(" ");
            }
            int c=1;
            for(int k=1;k<=i;k++){
                System.out.print(c+" ");
                c=c*(i-k)/k;
            }
            System.out.println();
        }
    }
}
