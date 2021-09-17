package com.company.pattern;

import java.util.Scanner;

public class DiamondWithSpace {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int rows= sc.nextInt();
        int x=rows;
        int y=rows;
        for(int i=1;i<rows;i++){
            for(int j=1;j<rows*2;j++){
                if(j==x||j==y)
                {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            x--;y++;
            System.out.println();
        }
        for(int i=rows;i>=1;i--){
            for(int j=1;j<rows*2;j++){
                if(j==x||j==y)
                {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            x++;y--;
            System.out.println();
        }

        }
}

