package org.launchcode;

import java.util.Scanner;

public class MpgCalc {
    public static void main(String[] args){
        Scanner inputOne = new Scanner(System.in);
        System.out.println("Please enter miles driven:");
        int miles = inputOne.nextInt();
        Scanner inputTwo = new Scanner(System.in);
        System.out.println("Please enter gallons used:");
        int gallons = inputTwo.nextInt();
        int mpg = miles / gallons;
        System.out.println("MPG is: " + mpg);
    }
}
