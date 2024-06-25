package org.launchcode;

//import Scanner utility

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        //Create new scanner instance
        Scanner input = new Scanner(System.in);
        // create radius
        double radius;
        //Asks for input and validates that the input is a positive number before proceeding
        while (true) {
            System.out.println("Enter a radius:");
            try {
                radius = Double.parseDouble(input.next());
                if (radius < 0){
                    System.out.println("Input positive number");
                    continue;
                }
                break; //will only get here if input was a double
            }
            catch (NumberFormatException ignore) {
                System.out.println("Invalid input.");
            }
        }
        //Updated area math called from method
        double area = Circle.getArea(radius);
        //Print result
        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
        //CLose scanner
        input.close();
    }
}
