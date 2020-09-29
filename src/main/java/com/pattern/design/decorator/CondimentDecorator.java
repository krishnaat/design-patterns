package com.pattern.design.decorator;

import lombok.Getter;
import lombok.Setter;

public abstract class CondimentDecorator extends Beverage {

    @Getter @Setter
    Beverage beverage;

    public abstract String getDescription();

    public abstract String getName();
}
