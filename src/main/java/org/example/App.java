/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        String item1p = scan.nextLine();
        System.out.print("Enter the quantity of item 1: ");
        String item1q = scan.nextLine();
        System.out.print("Enter the price of item 2: ");
        String item2p = scan.nextLine();
        System.out.print("Enter the quantity of item 2: ");
        String item2q = scan.nextLine();
        System.out.print("Enter the price of item 3: ");
        String item3p = scan.nextLine();
        System.out.print("Enter the quantity of item 3: ");
        String item3q = scan.nextLine();

        int i1p = Integer.parseInt(item1p);
        int i1q = Integer.parseInt(item1q);
        int i2p = Integer.parseInt(item2p);
        int i2q = Integer.parseInt(item2q);
        int i3p = Integer.parseInt(item3p);
        int i3q = Integer.parseInt(item3q);

        int item1tot = i1p*i1q;
        int item2tot = i2p*i2q;
        int item3tot = i3p*i3q;

        double subtotal = item1tot+item2tot+item3tot;
        double tax = subtotal*.055;
        double total = tax+subtotal;

        System.out.println(String.format("Subtotal: $%.2f",subtotal));
        System.out.println(String.format("Tax: $%.2f",tax));
        System.out.println(String.format("Total: $%.2f",total));
    }
}