package com.pattern.design.decorator.bevarage.options;

import com.pattern.design.decorator.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.setDescription("House Blend Coffee");
    }

    public double cost() {
        return .89;
    }
}
