/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Chase Cutshall
 */
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String orderamount;
        System.out.print(" What is the order amount? ");

        orderamount = input.next();

        Integer a = Integer.parseInt(orderamount);

        String state;
        System.out.print(" What is the state? ");

        state = input.next();

        String price;
        System.out.print(" What is the price? ");

        price = input.next();

        Integer b = Integer.parseInt(price);

        double subtotal = a * b;
        double salestax = subtotal * .055;
        double total = (subtotal + salestax);

        if (state.equals("WI")) {
            System.out.print("The subtotal is $" + subtotal + " dollars." + System.lineSeparator());
            System.out.print("The total is $" + total + " dollars.");
        }
        System.out.print("The total is $"+ subtotal +" dollars.");
    }
}