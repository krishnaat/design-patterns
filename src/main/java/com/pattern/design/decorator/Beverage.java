package com.pattern.design.decorator;

import lombok.Getter;
import lombok.Setter;

public abstract class Beverage {

    @Getter @Setter
    String description = "Unknown Beverage";

    @Getter
    public enum Size {
        TALL("Tall"),
        MEDIUM("Medium"),
        SMALL("Small");

        @Getter
        private String bevarageSize;

        private Size(String size){}
    };

    @Getter @Setter
    Size size = Size.TALL;

    public abstract double cost();
}
