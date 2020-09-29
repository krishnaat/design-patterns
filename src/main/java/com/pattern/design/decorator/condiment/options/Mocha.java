package com.pattern.design.decorator.condiment.options;

import com.pattern.design.decorator.Beverage;
import com.pattern.design.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.setBeverage(beverage);
    }

    public String getDescription() {
        return this.getDescription() + ", Mocha";
    }

    @Override
    public String getName() {
        return "Mocha";
    }

    @Override
    public double cost() {
//      Expecting mocha cost is same across different sizes
        return .20 + this.getBeverage().cost();
    }
}
