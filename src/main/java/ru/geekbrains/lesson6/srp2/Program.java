package ru.geekbrains.lesson6.srp2;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {
        Input input = new Input();
        Order order = new Order(input.getClientName(), input.getProduct(), input.getQnt(), input.getPrice());
        Data data = new Data(order);
        order.inputFromConsole();
        data.saveToJson();
    }

}
