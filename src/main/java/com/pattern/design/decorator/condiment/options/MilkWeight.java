package com.pattern.design.decorator.condiment.options;

import com.pattern.design.decorator.Beverage;
import com.pattern.design.decorator.CondimentSizeNotSupportedException;

enum MilkWeight {

    TALL(Beverage.Size.TALL){
        @Override
        public double getCost() {
            return .10;
        }
    },
    MEDIUM(Beverage.Size.MEDIUM) {
        @Override
        public double getCost() {
            return .15;
        }
    },
    SMALL(Beverage.Size.SMALL) {
        @Override
        public double getCost() {
            return .20;
        }
    };

    private Beverage.Size bevarageSize;

    MilkWeight(Beverage.Size size) {
        bevarageSize = size;
    }

    public static MilkWeight getMilkCost(Beverage.Size bevarageSize) {
        for (MilkWeight milkCost : values()) {
            if (milkCost.bevarageSize == bevarageSize) {
                return milkCost;
            }
        }
        throw new CondimentSizeNotSupportedException("Milk", bevarageSize);
    }

    public abstract double getCost();
}