package com.company;
/*
Lilly Thieberg 6/18/20
import scanner
initalize scanner
define the min and max as integers
define you awnser as a stirng
define interger n and make it a random number between 1 and 137 useing math. random and an eqution
make a do while stament for a loop for the number
use and if stament for the integer in the foloeing conditions
    if n is odd: wierd
    if n is even between 2-5 inclusive : not wierd
    if n is even between 6-20 inclusive : weird
    if n is even and greater then 20 : wierd
        it will eiiher print wird or not wierd based on the condtiond given
Ask them in they want to quit yes or no
and scan the anwser in
make the while stame for the anwaser


 */


import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // intalized and i use input when I want to scan

        int min = 1; // defining all the varibles below
        int max = 137;
        String answer;

        do { // make it a loop while...
            int n = (int) (Math.random() * (max - min + 1) + min);// this equations make this a random number bwteen 1 and 137
            System.out.println("your number is: " + n); // prints out the number

            if (n % 2 == 1) // below defines all condtions and what the output will be
                System.out.println("weird");
            if ((n % 2 == 0) && (n > 20)) // using mod to figure out wether the number the number is even or odd
                System.out.println("not weird");
            if ((n % 2 == 0) && (n >= 6 && n <= 20)) // the && makes it so both condtison must be true
                System.out.println("weird");
            if ((n % 2 == 0) && (n >= 2 && n <= 5))
                System.out.println("not weird");
            System.out.println("do you want to quit- yes or no: "); // asking if they want to keep going
            answer = input.next();
        }
        while (answer.contains("no")); // if the anwer by the user contain no they the program will keep runnning if not it will end
    }
}

