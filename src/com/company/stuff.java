package com.company;
import java.util.*;

class stringchallenge {
    public static void main(String[] args) {
        int stringnumber;
        Scanner userinput = new Scanner(System.in);
        do {
            System.out.println("How many strings would you like?");
            stringnumber = userinput.nextInt();
        }
        while (stringnumber < 1 || stringnumber > 10);

        for (int method = 1; method <= stringnumber; method++) {
            System.out.println("Input a string");
            String stringinput = userinput.next();
            if (stringinput.length() >= 2) {
                String words = output(stringinput);
                System.out.println(words);
            }
        }
    }
    public static String output(String stringinput){
        StringBuilder evenstring= new StringBuilder();
        StringBuilder oddstring= new StringBuilder();
        int stringlength= stringinput.length();
        for (int even=0; even<=stringlength-1;even=even+2){
            char outputchar= stringinput.charAt(even);
            evenstring.append(outputchar);
        }
        for (int odd=1; odd<=stringlength-1; odd=odd+2){
            char outputchar= stringinput.charAt(odd);
            oddstring.append(outputchar);
        }
        return evenstring + " " + oddstring;
    }
}