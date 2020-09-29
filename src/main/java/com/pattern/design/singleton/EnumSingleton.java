package com.pattern.design.singleton;

/**
 *  @Author : Krishna Murari, krishnamurari.at@gmail.com
 *  This class provides an example of singleton pattern using "Enum"
 *
 * 1. Enums are inherently serializable, we don't need to implement it with a serializable interface
 * 2. Enum implicity defines private constructor.
 * 3. Works for Java 5 onwards
 */
public enum EnumSingleton {

    INSTANCE;

    private int value;

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
