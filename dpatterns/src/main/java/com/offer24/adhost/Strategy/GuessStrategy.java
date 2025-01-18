package com.offer24.adhost.Strategy;

public class GuessStrategy implements PricingStrategy {
    @Override
    public double calculatePrice() {
        return Math.random();
    }
}
