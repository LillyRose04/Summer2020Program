package com.company;
/*
Lilly Thieberg 6/18/20
define the min and max
man your integer random bewteen the contrants given useing the min and max
use and if stament for the integer
make other condidtional stament for the given conditions
p[rint out the anwser based of the if statement


 */


public class ConditionalStatement {
    public static void main(String[] args) {
        int min =1;
        int max = 137;

        int n = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("your number is: " + n);

        if (n % 2 ==1)
            System.out.println("weird");
        if ((n % 2 ==0) && (n>20))
            System.out.println("not weird");
        if ((n % 2 ==0) && (n>= 6 && n<=20))
            System.out.println("weird");
        if ((n % 2 ==0) && (n>= 2 && n<=5))
            System.out.println("not weird");

    }
}
