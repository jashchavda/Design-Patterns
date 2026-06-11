package org.example;

class WalletPayment implements PaymentStrategy {

    @Override
    public void pay() {

        System.out.println("Payment through Wallet");

    }

}
