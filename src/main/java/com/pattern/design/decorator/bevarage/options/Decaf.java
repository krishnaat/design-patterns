package com.pattern.design.decorator.bevarage.options;

import com.pattern.design.decorator.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        this.setDescription("Decaf Coffee");
    }

    public double cost() {
        return 1.05;
    }
}
