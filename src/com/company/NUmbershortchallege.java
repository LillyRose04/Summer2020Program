package com.company;
/* Lilly Thieberg 6/9/20 Short numberchallege print numbers 0-100 even numbers then odds numbers*/
public class NUmbershortchallege {
    public static void main(String args[]) {
        int n = 100;
        for (int i = 0; i <= n; i++) {
            //if number%2 == 0 it means its an even number
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println(" ");
        for (int i = 0; i <= n; i++) {
            //if number%2 == 0 it means its an even number
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}