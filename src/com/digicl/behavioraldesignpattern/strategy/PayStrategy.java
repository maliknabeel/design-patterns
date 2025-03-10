package com.digicl.behavioraldesignpattern.strategy;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
