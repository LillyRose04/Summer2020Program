package com.company;

import java.util.Scanner;

/* Lilly Thieberg 6/10/20 Ganster name code*/
public class ganstername {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input your name");
        String name = input.nextLine();
        String first = name.substring (0,name.indexOf(" "));
                String last = name.substring(name.indexOf(" ")+1);
                last = last.toUpperCase();
                String fInitial = first.substring(0,1);
                System.out.println("Your ganster name is \"" + fInitial + ". Diddy " + last + " " + first + "-izzle\"");

    }
}