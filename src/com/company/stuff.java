package com.company;
import java.util.Scanner;
public class stuff {
    public static Scanner Keyboard=new Scanner (System.in);
    public static void main(String[] args) {
       /*
       Ashton Higgins
       First I am going to import and set up my scanner
       Then I will declare an integer
       Declare a double
       And declare a string
       I will then ask for a number, then a second number, and then the person's favorite lunch place (as a string)
       I will add my integer with the number (integer) that I asked for into a new integer variable
       Then I will add my double number with the second number I asked for and add them to make a new double variable
       Lastly, I will put my string (after) with the term I was given in the scanner and make a new string variable
       to make a complete statement
       I will then print the new integer variable
       Then print the new double variable
       And then the new string statement
       The system is complete once all three new lines are printed!
       */
        int num1= 4;
        double doubley1= 4.0;
        String statement1= "is my favorite place to have lunch";
        System.out.print("Type a whole number: ");
        int integer= Keyboard.nextInt();
        System.out.print("Type any number: ");
        double number= Keyboard.nextDouble();
        System.out.print("Where is your favorite place to have lunch? Your answer: ");
        String lunch= Keyboard.nextLine();
        int variablename= integer+num1;
        double variable= doubley1+number;
        String stringname= statement1+lunch;
        System.out.println(variablename);
        System.out.println(variable);
        System.out.println(stringname);
    }
}
