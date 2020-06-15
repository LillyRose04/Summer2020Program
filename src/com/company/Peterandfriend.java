package com.company;

import java.util.*;

/* Lilly Thieberg 6/10/20 Ganster name code*/
//one word at a time--- only first word for now
//find the first word ----> indexof " "
// sub (0 to index)
// I need to count the charaters that repeat --- declare intger variable when?
// to find the first space... stringobject.indexof()---> declare an int Variable for the index
// Get first word ---> stringOject.substring(,0,5)
// declare char so that i can ake he har of the word at the indec for my loop EX: char letter
// for loop (firstword.lengh())
//          letter= firstworld.charAt(index of your loop)
// count++
//index=firstWord.dubstring(loop index)firstWord.indexOf(letter);
// if (index >0){
//count++
//delete that letter from the firstWord}
// prin your letter and count
// count=0
public class Peterandfriend {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        //have user type in the phrase they want  ie. peter and his friend
        System.out.print("Please type in a phrase");
        String fullPhrase = console.nextLine();
        int index = fullPhrase.indexOf(" ");
        String firstWord = fullPhrase.substring(0, index);
        char letter;
        int count = 0;
        for (int i = 0; i < firstWord.length(); i++) {
            letter = firstWord.charAt(i);
            count++;

            System.out.println(letter + "     " + count);
            index = firstWord.indexOf(firstWord.substring(index));
//        if (index >0){
//            count++
            count = 0;
        }
    }
}
