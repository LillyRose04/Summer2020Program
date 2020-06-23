package com.company;

import java.util.Scanner;

/*
Lilly Thieberg 6/21/2020
import scanner
initalize scanner
declare t as my varible for number of words
open a do statment
ask them in input a number between 1 and 10
give T qith next screen as the varible that was inputted
clos do and say while for t between 1-10 so that is they input a number a value not between the constants they have to input a new one
make an array = to srting[t]
ask them to input a word more then 5 charters long
make an index ( in a for loop)nor a varible i that will index the array
appile i to the array and collect the inputed values
close the loop
print a gap for nice spacing :)
create a new array  equal to new String[word.length] this new array  will end up containg the fished word
make an index i (in a for loop) to apply to the new array
make the new array equal to your method and the array word[i]
pint out the new array Words[i]
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
public class Stringchallengearray {
    public static void main(String[] args) {
        Scanner screen = new Scanner(System.in);
        int T;
        do {
            System.out.println("How many words will you input (must be between 1 and 10)");
            T = screen.nextInt(); // takle what was inputed as T
        } while (T < 1 || T > 10); // must be between the 2 number in not then it will ask the user again
        String[] word = new String[T]; // this is the declaration =of an array that will collect the words inputed evutally
        System.out.println("input a word (at least 5 charters please)");
        for (int i = 0; i < word.length; i++) { // this given the index of the array and intilizes it wil the ++
            word[i] = screen.next(); // collect the words as word with the i index
        }
        System.out.println(); // give a gap between the inputed words and the out[uted word it looks better this was
        String[] Words = new String[word.length]; // take the inputed values from the array in a new stirng
        for (int i = 0; i < word.length; i++ ){ // gives an index for i
            Words[i]= dividing(word[i]); // applies the index i to the stind words and use the method divding with will slip up ther words
            System.out.println(Words[i]); //. print the final words
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