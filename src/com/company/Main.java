package com.company;

public class Main {

    public static void main(String[] args) {
        Line();
        Top();
        Botton();
        Line();
    }
    public static void Top (){
        System.out.println("|      <><>      |");
        System.out.println("|    <>....<>    |");
        System.out.println("|  <>........<>  |");
        System.out.println("|<>............<>|");
    }
    public static void Botton(){
        System.out.println("|<>............<>|");
        System.out.println("|  <>........<>  |");
        System.out.println("|    <>....<>    |");
        System.out.println("|      <><>      |");
    }
    public static void Line(){
        System.out.print("#");
        for(int dash=0;      dash<16;     dash++){
            System.out.print("=");
        }
     System.out.println("#");
    }
}