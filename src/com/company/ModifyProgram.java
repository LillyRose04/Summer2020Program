package com.company;
/* Lilly Thieberg 6/8/20 Modify program with constants and integers*/
public class ModifyProgram {
    public static final int Amount1= 38;
    public static final int Amount2= 40;
    public static final int Amount3= 30;
    public static final double Tax= .08;
    public static final double Tip= .15;


        public static void main(String[] args) {

            // Calculate total owed, assuming 8% tax / 15% tip

            System.out.println("Subtotal:");

            System.out.println(Amount1 + Amount2 + Amount3);

            System.out.println("Tax:");

            System.out.println((Amount1 + Amount2 + Amount3) * Tax);

            System.out.println("Tip:");

            System.out.println((Amount1 + Amount2 + Amount3) * Tip);

            System.out.println("Total:");

            System.out.println(Amount1 + Amount2 + Amount3 +

                    (Amount1 + Amount2 + Amount3) * Tip +

                    (Amount1 + Amount2 + Amount3) * Tax);

        }

    }