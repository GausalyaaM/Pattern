package com.company.pattern;
import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int rows= sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=rows-i;j>1;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=rows-2;i>=0;i--){
            for(int j=1;j<rows-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        }
    }

