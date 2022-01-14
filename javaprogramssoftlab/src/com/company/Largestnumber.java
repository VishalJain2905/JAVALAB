package com.company;

import java.util.Scanner;
public class Largestnumber
{
    public static void main(String[] args)
    {
        int a, b, c, largest;
//object of the Scanner class
        Scanner sc = new Scanner(System.in);
//reading input from the user
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();
        largest = Math.max(c, (Math.max(a, b)));
        System.out.println("The largest number is: "+largest);
    }
}
