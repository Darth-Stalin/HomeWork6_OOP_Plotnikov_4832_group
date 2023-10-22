package ru.geekbrains.lesson6.srp2;

import java.util.Scanner;

public class Input {
    private String clientName = prompt("Client name: ");
    private String product = prompt("Product: ");
    private int qnt  = Integer.parseInt(prompt("Quantity: "));
    private double price = Double.parseDouble(prompt("Price: "));

    public Input() {
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public double getPrice() {
        return price;
    }
}
