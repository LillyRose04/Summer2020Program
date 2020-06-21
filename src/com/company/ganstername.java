package com.company;

import java.util.Scanner; // import the scanner, could also use import java.util.*; if i wanted

/* Lilly Thieberg 6/10/20 Ganster name code*/
public class ganstername {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); // intializing scanner
        System.out.print("Please input your name"); // asking the user to input their name
        String name = input.nextLine(); // defrine the input as name
        String first = name.substring (0,name.indexOf(" ")); //uses indexof to carve out the first name because it starts as 0 and end at a space
                String last = name.substring(name.indexOf(" ")+1); // this mane there last mane a string
                last = last.toUpperCase(); // makes their last name uppercase
                String fInitial = first.substring(0,1); // make ther fisrt intial a string by using substring
                System.out.println("Your ganster name is \"" + fInitial + ". Diddy " + last + " " + first + "-izzle\""); // puts all of the string together with the other words in the ganster name

    }
}