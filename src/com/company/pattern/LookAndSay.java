package com.company.pattern;
import java.util.Scanner;
public class LookAndSay {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size= scan.nextInt();
        String str="1";
        System.out.println("1");
        int i=1,j;
        while(i<size){
            String temp="";
            int count=1;
            char[] arr=str.toCharArray();
            for(j=1;j<str.length();j++){
                if(arr[j]!=arr[j-1]){
                    System.out.print(count+""+arr[j-1]);
                    temp+=count+""+arr[j-1];
                    count=1;
                }
                else{
                    count++;
                }
            }
            System.out.println(count+""+arr[j-1]);
            temp+=count+""+arr[j-1];
            str=temp;
            i++;
        }
    }
}
