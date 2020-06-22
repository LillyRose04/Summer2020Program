package com.company;
import java.util.*;
/*
Lilly Thieberg 6/21/2020
import scanner
initalize scanner
declare string object word
declare t as my varible for number of words
open a do statment
ask them in input a number between 1 and 10
give T qith next screen as the varible that was inputted
clos do and say while for t between 1-10 so that is they input a number a value not between the constants they have to input a new one
open for loop for inoutting the word and set contraints for the number of time the loop runs
open do loop
ask them to input the word
"collect word as the varible word useinf screen.next
close do stament then use while and contran th e world lenth to bewtten 2 and 10000
creat a string split = dividing(word); dividing is the new method
print Split
method dividing
declare string evens and odds ti equal ""
open for loop contran the int even to equal 0 be less then word then and the intial it to it get the even number
char position = word.charAt(even);
the have evens now eaqual even + positison
opene for loop with contraints for int odd have it eqaul 1 less then word lenth and then intal it so it gets the odds
char position = word.charAt(odd);
the have odds now eaqual odds + positison
make a stinr awnser to= evens space odds
then return awnser
 */
public class Stringchallenge {
    public static void main(String[] args) {
        Scanner screen = new Scanner(System.in);
        String word;
        int T;
        do {
            System.out.println("How many words will you input (must be between 1 and 10)");
            T = screen.nextInt(); // takle what was inputed as T
        } while (T < 1 || T > 10); // must be between the 2 number in not then it will ask the user again

        for (int i = 1; i <= T; i++) { // number of times it will ask you to input words
            do {
                System.out.println("Input your word:");
                word = screen.next(); // takes what was inputed as word
            } while (word.length() < 2 || word.length() >= 10000); // makes sure the lenth of the word is between 2 and 10000
            String Split = dividing(word); // new strin that calls to the methos that will spelit the word and return the anwser
            System.out.println(Split); // the printing of the string answer from the method
        }
    }

    public static String dividing(String word) {
        String evens = "";
        String odds = "";
        for (int even = 0; even < word.length(); even += 2) { // start at 0 and then 2 is added to that the even charters are gotton
            char position = word.charAt(even); // gets the charters at the given even posistions
            evens = evens + position; // the varivel now has all the even postistioned letters
        }
        for (int odd = 1; odd < word.length(); odd += 2) { // stars at 1 and then 2 is added so that the odd charter are gotton
            char position = word.charAt(odd); // gets the chartas at the given odd postistions
            odds = odds + position; // the vaivle is now the combied odd posistioned letters
        }

        String answer = evens + " " + odds; // the string gives the even and the odds with a space in bewteen
        return answer; // return the string to be printed
    }


}