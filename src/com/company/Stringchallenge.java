package com.company;
import java.util.*;
public class Stringchallenge {
    public static void main(String[] args) {
    Scanner screen = new Scanner(System.in);
    String word = screen.nextLine();
    String even = "";
    String odd ="";
    for (int i = 0; i < word.length(); i+=2){
        even= even+word.charAt(i);
        }
        for (int i = 1; i < word.length(); i+=2) {
            odd = odd + word.charAt(i);
        }
        String answer = even+" "+odd;
        System.out.print(answer);
    }
}