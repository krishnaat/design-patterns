package com.pattern.design.decorator.bevarage.options;

import com.pattern.design.decorator.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        this.setDescription("Espresso");
    }

    public double cost() {
        return 1.99;
    }
}