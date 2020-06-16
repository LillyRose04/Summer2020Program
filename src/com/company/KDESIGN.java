package com.company;
/* Lilly Thieberg 6/9/20 deign woth letter and charters programing */
public class KDESIGN {

    public static final int SIZE= 5;
    public static void main(String[] args) {
        Top();
        Bottom();
    }

    public static void Top() {
        char letter = 65;
        for (byte line = SIZE; line >= 0; line--) { // -- BEUCASE it is decreseing in value from line to line
            for (byte count = 0; count <= line; count++) {
                System.out.print((char) (letter + count) + " ");
            }
            System.out.println();

        }

    } // I am haveing trouble figureing out how to get rig of the space
    public static void Bottom() {
        char letter = 65;
        for (byte line = 1; line <= SIZE; line++) { //++ because the value from line to line is incrseaaing
            for (byte count = 0; count < line; count++) {
                System.out.print((char) (letter + count) + " ");
            }
            System.out.println();
        }

    }
}

