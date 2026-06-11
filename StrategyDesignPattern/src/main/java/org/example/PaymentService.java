package org.example;

public class PaymentService {

    // create the reference to the payment strategy
    PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy) {
           this.paymentStrategy = paymentStrategy;
    }

    public void makePayment() {
        paymentStrategy.pay();
    }

}
