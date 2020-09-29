package com.pattern.design.decorator.condiment.options;

import com.pattern.design.decorator.Beverage;
import com.pattern.design.decorator.CondimentDecorator;
import com.pattern.design.decorator.CondimentSizeNotSupportedException;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.setBeverage(beverage);
    }

    public String getName() {
        return "Milk";
    }

    public String getDescription() {
        return this.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        double milkCost = MilkWeight.getMilkCost(this.getBeverage().getSize()).getCost();
        return milkCost + this.getBeverage().cost();
    }
}
