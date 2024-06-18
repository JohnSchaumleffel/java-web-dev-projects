package org.launchcode;

import java.util.Scanner;

public class RectArea {
    public static void main(String[] args){
        Scanner inputOne = new Scanner(System.in);
        System.out.println("Please enter length of rectangle:");
        int length = inputOne.nextInt();
        Scanner inputTwo = new Scanner(System.in);
        System.out.println("Please enter width of rectangle:");
        int width = inputTwo.nextInt();
        int area = length*width;
        System.out.println("Area of rectangle is: " + area);
    }
}
