package com.offer24.adhost.Strategy;

public class PricingManager {
    PricingType type;
    PricingStrategy strategy;
    public PricingManager(PricingType type, PricingStrategy strategy) {
        this.type = type;
        this.strategy = strategy;
    }
    public double getPrice() {
        return strategy.calculatePrice();
    }

}
