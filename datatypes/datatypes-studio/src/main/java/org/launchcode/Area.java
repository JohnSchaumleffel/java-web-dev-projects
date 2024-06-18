package org.launchcode;

//import Scanner utility

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        //Create new scanner instance
        Scanner input = new Scanner(System.in);
        //Prompt user for radius
        System.out.println("Enter a radius:");
        //Catch input
        double radius = input.nextDouble();
        //Do area math
        //double area = 3.14 * radius * radius;
        //Updated area math
        double area = Circle.getArea(radius);
        //Print result
        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
        input.close();
    }
}
