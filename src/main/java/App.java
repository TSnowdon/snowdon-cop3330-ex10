import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Tyler Snowdon
 */
public class App {

    private static final int ITEM_AMOUNT = 3;
    private static final double TAX_RATE = 5.5;

    public static void main(String[] args) {
        int[] prices = new int[ITEM_AMOUNT];
        int[] quantities = new int[ITEM_AMOUNT];
        double subTotal = 0;
        Scanner reader = new Scanner(System.in);
        // Input
        for (int i = 0; i < ITEM_AMOUNT; i++) {
            try {
                System.out.print("Enter the price for item " + (i + 1) + ": ");
                prices[i] = Integer.parseInt(reader.nextLine());
                System.out.print("Enter the quantity for item " + (i + 1) + ": ");
                quantities[i] = Integer.parseInt(reader.nextLine());
            } catch (Exception e) {
                System.out.print("Your input wasn't a valid number, please restart the program and try again.");
                return;
            }
            // Processing
            subTotal += (prices[i] * quantities[i]);
        }
        double taxAmount = subTotal * (TAX_RATE / 100);
        double total = subTotal + taxAmount;
        // Output
        System.out.printf("Subtotal: $%.2f %n", subTotal);
        System.out.printf("Tax: $%.2f %n", taxAmount);
        System.out.printf("Total: $%.2f %n", total);
    }
}
