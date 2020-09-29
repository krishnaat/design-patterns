package com.pattern.design.decorator.condiment.options;

import com.pattern.design.decorator.Beverage;
import com.pattern.design.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.setBeverage(beverage);
    }

    public String getDescription() {
        return this.getDescription() + ", Soy";
    }

    @Override
    public String getName() {
        return "Soy";
    }

    @Override
    public double cost() {
//      Expecting mocha cost is same across different sizes
        return .15 + this.getBeverage().cost();
    }
}
