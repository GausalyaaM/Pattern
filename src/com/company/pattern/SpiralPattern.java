package com.company.pattern;

import java.util.Scanner;

public class SpiralPattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row=sc.nextInt();
        System.out.println("Enter the number of col:");
        int col= sc.nextInt();
        System.out.println("Enter the number:");
        int num= sc.nextInt();
        int[][] mat=new int[row][col];
        int top=0;
        int down=row-1;
        int left=0;
        int right=col-1;
        int c;
        while(true){
            if(top%2==0){
                c=num;
                num--;
            }
            else
            {
                c=num;
                num--;
            }
            for(int i=left;i<=right;i++){
                mat[top][i]=c;
            }
            top++;
            if (top > down || left > right) {
                break;
            }
            for( int i=top;i<=down;i++){
                mat[i][right]=c;
            }right--;
            if (top > down || left > right) {
                break;
            }
            for(int i=right;i>=left;i--){
                mat[down][i]=c;
            }down--;
            if (top > down || left > right) {
                break;
            }
            for(int i=down;i>=top;i--){
                mat[i][left]=c;
            }
            left++;
            if (top > down || left > right) {
                break;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
