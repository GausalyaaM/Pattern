package com.company.pattern;

import java.util.Scanner;

public class DiamondWithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int rows= sc.nextInt();
        int c=1;
        for(int i=1;i<=rows;i++){
            for(int j=rows-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=c;j>=1;j--){
                System.out.print(Math.abs(j-i)+1);
            }
            c+=2;
            System.out.println();
        }
        c=c-3;
        for(int i=rows;i>=1;i--){
            for(int j=i;j<=rows;j++){
                System.out.print(" ");
            }
            for(int k=c;k>1;k--){
                System.out.print(Math.abs(k-i)+1);
            }
            c-=2;
            System.out.println();
        }
    }
}
