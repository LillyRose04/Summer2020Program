package com.company;
import java.util.*;
import java.util.Scanner;

/* Lilly Thieberg 6/11/20 sting string andusing different data types*/
public class Testingnamesthing {
    public static void main(String args[]) {// have user input name
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Please enter your full name");
        String fullName= keyboard.nextLine();
                int indexOf= fullName.indexOf(" ");
                        System.out.println(indexOf);
        String lastName = fullName.substring(indexOf+1);
        String firstName = fullName.substring(0, indexOf);
        bymyself(firstName);
        bymyself(lastName);
        Challenge2.Line();
        char letter = firstName.charAt(0);
        System.out.println(letter + ".");
    }
    public static void bymyself(String name){
        System.out.println("Hello" + name);
    }
}