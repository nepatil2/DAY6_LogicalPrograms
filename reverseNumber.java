package com.bl.logicalPrograms;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int temp = num;
        int rev ;
        int sum =0;
        while (num > 0){
            rev =num % 10;
            sum=(sum*10) + rev;
            num = num / 10;
        }
        if(temp == sum){
            System.out.println("Palindrome Number is : " + sum );
        }
        else
            System.out.println("Number is not palindrome Number : " + sum);

    }

}
