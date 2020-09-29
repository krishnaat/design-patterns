package com.pattern.design.decorator.bevarage.options;

import com.pattern.design.decorator.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.setDescription("Dark Roast Coffee");
    }

    public double cost() {
        return .99;
    }
}
