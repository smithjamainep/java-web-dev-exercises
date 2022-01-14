package exercises;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        //Scanner object handles user input
        Scanner input = new Scanner(System.in);
        //println handles user input
        System.out.println("What is the length?");
        //need to know datatype, declare type first and then nextdatatype example below
        double length = input.nextDouble();

        System.out.println("What is the width? :");
        double width = input.nextDouble();

        double area = length * width;
        System.out.println("The area of the figure is estimated to be " + area);

    }
}
