package com.company;
/* Lilly Thieberg 6/8/20 challege 2 program progem all with loops*/
public class Challenge2 {
    public static void main(String[] args) {
        Line();
        Top();
        Bottom();
        Line();
        Bottom();
        Top();
        Line();
    }

    public static void Bottom(){
        for(int line=1;  line <5;  line++){
            System.out.print("|");
            for(int space=1;  space<= line+0;  space++){
                System.out.print(" ");
            }
            for(int  dot =1; dot <=-1*line+4; dot++){
                System.out.print("\\");
            }

            System.out.print("*");

            for(int  dot =1; dot <= -1*line+4; dot++){
                System.out.print("/");
            }
            for(int space=1;  space<= line+0;  space++){
                System.out.print(" ");
            }
            System.out.println("|");

        }
    }
    public static void Line(){
        System.out.print("+");
        for(int dash=0;      dash<9;     dash++){
            System.out.print("-");
        }
        System.out.println("+");
    }
    public static void Top(){
        for(int line=1;  line <5;  line++){
            System.out.print("|");
            for(int space=1;  space<=-1*line+5;  space++){
                System.out.print(" ");
            }
            for(int  dot =1; dot <= line-1; dot++){
                System.out.print("/");
            }

            System.out.print("*");

            for(int  dot =1; dot <= line-1; dot++){
                System.out.print("\\");
            }
            for(int space=1;  space<=-1*line+5;  space++){
                System.out.print(" ");
            }
            System.out.println("|");

        }
    }
}

