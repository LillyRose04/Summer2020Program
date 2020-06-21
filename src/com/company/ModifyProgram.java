package com.company;
/* Lilly Thieberg 6/10/20 Modify program with constants and integers- version 2 contains some simplfied values*/
public class ModifyProgram {


        public static void main(String[] args) {
            int Amount1= 38; // so that the amounts can be change if needed
            int Amount2= 40;
            int Amount3= 30;
            double Tax= .08;
            double Tip= .15;

            int Subtotal= Amount1+Amount2+Amount3; // calculate the subtoal of the bill - it is an int
            // Calculate total owed, assuming 8% tax / 15% tip
            double Total = Subtotal + Tax + Tip;

            System.out.println("Subtotal: "+ Subtotal);

            System.out.println("Tax: " + Tax);

            System.out.println("Tip: " + Tip);

            System.out.println("Total: " + Total);

        }

    }