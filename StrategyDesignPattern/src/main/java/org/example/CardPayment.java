package org.example;

public class CardPayment implements PaymentStrategy  {

    @Override
    public void pay() {
        System.out.println("Payment through card");
    }
}
