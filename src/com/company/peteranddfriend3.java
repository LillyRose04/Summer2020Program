package com.company;

import java.util.Scanner;

/* Lilly Thieberg 6/15/20 name counter name code*/

public class peteranddfriend3 {
    public static void main(String[] args) {
        Scanner screen = new Scanner(System.in);
        System.out.println("Say something!");
        String phrase = screen.nextLine();
        int indexOf = phrase.indexOf(" ");
        String firstword = phrase.substring(0, indexOf+1);// "Peter "
        // phrase = phrase - firstword
        char letter;
        int count = 0;
        for (int index = 0; index < firstword.length(); index++) {
            letter = firstword.charAt(index);
            if (letter != ' ') {
                count++;
                String temp = phrase.substring(index + 1); // replace first word with phrase on he count but not on the letter so that we can the count of the phrase but only for the charaters if the frist word
                indexOf = temp.indexOf(letter);
                while (indexOf >= 0) {
                    count++;
                    temp = temp.substring(indexOf + 1);
                    indexOf = temp.indexOf(letter);
                }
firstword = firstword.replace(letter, ' ');

                System.out.println(letter + " " + count);
                count = 0;
            }
        }
    }
}
