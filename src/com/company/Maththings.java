package com.company;
import java.util.*;
// Lilly Thieberg 6/15/20 woring on printf
public class Maththings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;
        Random randy = new Random();
        do {
            int rand = randy.nextInt(50) +100;
            double doubly1 = Math.sqrt(8.64);
            double doubly2 = Math.log(doubly1) * 5.287287;
            double doubly3 = (doubly2) / rand;
            System.out.printf("Your random is: \n %10.5f \n %10.5f \n %10.5f \n", doubly1, doubly2, doubly3);
            System.out.println(" Do you want quit");
            answer = input.next();
        }
            while(answer.contains("n"));
        }
    }


