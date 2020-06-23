package com.company;

import java.util.*;
/*
pusedo code;
make a randim
get a random number for the suze of you string bewteen five and ten
make a new inter for you number eqaul to the a new inter with the size
make a for loop fopr the numbers and make the number randomized with a limmit at one hundred for int
make e new intergers for the switched numbers places
make a do while so that if the random inters are the same it will repeat until they are not
with in the do while get 2 random inters constrained by size
print you oroginal array
then aplie the method reverse to numbers
print your new array
Method reverse
make a new integer temp eqaul to num a ( a and b are in public static int)
make num a eqaul to num b
make num b = to temp
and then resturn num to the orginal loop
this was atculy very fun :)
 */

public class revrsenums {
    public static void main(String[] args){
        Random randy = new Random();
        int size = randy.nextInt(5)+6;// gives you random number of numbers in the string from five to ten
        int [] numbers = new int[size]; // makes the array numer equal to the the size so it has that amount of numbers
        for (int i=0; i<size; i++){ // fror loop for numbers
            numbers[i] = randy.nextInt(100);//contrains the size  of the numbers
        }
        int l;// intergers for the switched array numbers
        int c;
        do {
            l = randy.nextInt(size); // randomizes the number place within the random number size
            c = randy.nextInt(size);
        } while (l==c); // makes it so that if the the 2 random number are the same the number are randomized
        System.out.println(Arrays.toString(numbers));// print orignal array
        numbers = reverse(numbers,l,c);// switches the number
        System.out.println(Arrays.toString(numbers));// prints new array
    }
    public static int [] reverse (int [] num, int a, int b){// this method will switch the numbers // the placement of a and b corralates to l and c
        int temp = num [a];
        num[a] = num [b];// swutches the numbers
        num[b]= temp;
        return num; // return the number from the method to the main loop
    }
}
