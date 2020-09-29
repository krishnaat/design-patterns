package com.pattern.design.decorator.condiment.options;

import com.pattern.design.decorator.Beverage;
import com.pattern.design.decorator.CondimentDecorator;
import com.pattern.design.decorator.CondimentSizeNotSupportedException;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.setBeverage(beverage);
    }

    public String getDescription() {
        return this.getDescription() + ", Whip";
    }

    @Override
    public String getName() {
        return "Whip";
    }

    @Override
    public double cost() {
        double whipCost;
        if( this.getBeverage().getSize() == Size.TALL){
            whipCost = .10;
        }
        else if( this.getBeverage().getSize() == Size.TALL){
            whipCost = .10;
        }
        else if( this.getBeverage().getSize() == Size.TALL){
            whipCost = .10;
        }
        else{
            throw new CondimentSizeNotSupportedException("Whip", this.getBeverage().getSize());
        }
        return whipCost + this.getBeverage().cost();
    }
}
