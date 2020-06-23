package com.company;
/*  Lilly Thieberg, Emma Nguyen,Valerie Xu 6/22/2020
Pseudocode:
Import random class
Open main brackets
    declare variable 'days' (7)
    make array
    print random
    for loop to fill up values
        add values together
        divide by days. nice
    close for loop
    find average by dividing sum/days
    open new for loop
        loop for finding average, increase the days over average by 1 everytime 1 is found
    close for loop
    print statements
close main brackets
 */

import java.util.*;
public class WEATHERCHALLEGE {
    public static void main(String[] args) {
        //declare varible
        Scanner screen = new Scanner(System.in);
        System.out.println("how many days?");
        int days = screen.nextInt();
        //making array
        int [] temp = new int[days]; // array or the days temps
        int num=0;
//add random
        Random randy = new Random ();
        //for loop for the random temps
        for (int index=0; index<days; index++){
           temp[index] = randy.nextInt(86)+25;
         // sotring and reading the temp
            System.out.println("Day" + (index+1)+ "'s high temp " + temp [index]);
            //equation: name.nextInt(size of range) + min, where (size of range) is (max - min + 1)
            //getting sum
            num += temp[index];
        }
        //getting average
        double average = (double) num/days;

        //finding out how many days are above average
        int con = 0;
        for (int i =0; i < days; i++){
            if (temp[i] > average){
                con++;
            }
        }
        //prints out the lines we need.
        System.out.printf("The average temperature = %.1f\n", average);
        System.out.println("There were "+ con +" days above average.");
    }
}