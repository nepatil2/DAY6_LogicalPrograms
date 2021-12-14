package com.bl.logicalPrograms;

import java.util.Scanner;

public class primeNumber {
    static int result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();

        for (int i = 2; i <= num/2 ; i++) {
            if (num % i == 0) {
                result = 1;
                break;
            }
            }
        if(num == 1) {
            System.out.println("Number is not Prime number nor composite number");
        }
        else{
            if (result == 0)
            System.out.println("number is  prime");
            else
                System.out.println("Number is not prime");
        }
        }
    }


