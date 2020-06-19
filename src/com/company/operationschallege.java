package com.company;
/* import scanner
Lilly Thieberg 6/18/20
define your vaibles
type phrase to have them input with *3 for eachof the values
vauible = screen.next
`   use next double for the first one use next interger for the last 2
define metmtod
make method with public startic and in pratethis put in tne vairble used in the scanner
makr the tip cakulation and make tip a varible
make the tax calulation and make tax a vaible
add meal cost tip and tax
print the toatal
 */
import java.util.*;
public class operationschallege {
    public static void main(String[] args) {
        double mealCost;
        int tipPercent;
        int taxPercent;
        Scanner screen = new Scanner(System.in);

        System.out.println("Meal cost:");
        mealCost = screen.nextDouble();
        System.out.println("Tip percent:");
        tipPercent = screen.nextInt();
        System.out.println("Tax rate:");
        taxPercent = screen.nextInt();

        solve(mealCost, tipPercent, taxPercent);
    }
    public static void solve(double mealCost, int tipPercent, int taxPercent ){
        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;
        double total= mealCost+ tip + tax;
        total = Math.round(total);

        System.out.println("Total: " + total);

    }
}
