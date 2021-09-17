package com.company.pattern;
import java.util.Scanner;
public class ZPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int rows = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                if(i==0||i==rows-1||j==rows-i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
