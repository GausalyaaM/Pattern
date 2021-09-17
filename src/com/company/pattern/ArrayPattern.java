package com.company.pattern;
import java.util.Scanner;
public class ArrayPattern {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=scan.nextInt();
        char[] ch=new char[size];
        for(int i=0;i<size;i++){
            ch[i]=scan.next().charAt(0);
        }
       // for(int i=0;i<size;i++){
         //   System.out.println(ch[i]);
        //}
        for(int i=0,j=size-1;i<=j;i++,j--){
            if(i!=j){
            System.out.println(ch[i]+" "+ch[j]);
        }else{
            System.out.println(ch[i]);
    }}
int k=size/2;
for(int i=k-1,j=k+1;j<size&&i>=0;i--,j++){
    System.out.println(ch[i]+" "+ch[j]);
}
}
}