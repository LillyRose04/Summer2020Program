package com.company;
// Lilly Thieberg 6/16 code
/*Psuecode-but I started the real one (when I did this)
import scanner
declare all three constants that where given
declare the tree new varibles
create scanner object
give driection to input with println to input integer
new varible  = screen.next int
give driection to input with println to input double
new varible  = screen.next double
give driection to input with println to input string/ phrase
new varible  = screen.next line
make your caulation for i + inputed value with value
make calulation for d + inputed value with value
add the concatinations with the string valible
print the first value from the integer
print the values from the sum of the double aggesting the decimal restrictions
print the result of the cancatonation
 */

import java.util.*;


public class datatypeschallege {

    public static void main(String args[]) {
        int i = 4;
        double d = 4.0;
        String s = "Greenhill";
        int thing1;
        double thing2;
        String thing3;
        Scanner screen = new Scanner(System.in);
        System.out.println("input your integer");
        thing1 = screen.nextInt();
        System.out.println("input your double");
        thing2 = screen.nextDouble();
        screen = new Scanner(System.in);
        System.out.println("input your phrase");
        thing3 = screen.nextLine();

        int a1 = i + thing1;
        double a2 = d + thing2;
        String a3 = (s + " " + thing3);
        System.out.println (a1);
        System.out.printf ("%.1f \n",  a2);
        System.out.println (a3);


    }
}