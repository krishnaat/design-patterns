package com.pattern.design.decorator;

import lombok.Getter;

public class CondimentSizeNotSupportedException extends RuntimeException{

    @Getter
    private String message;

    public CondimentSizeNotSupportedException(String condimentName, Beverage.Size bevarageSize) {
        this.message = condimentName + " doesn't support " + bevarageSize.getBevarageSize() + " size as of now.";
    }
}
