package com.pattern.design.singleton;

import lombok.Getter;
import lombok.Setter;

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

    @Getter
    @Setter
    private Integer value;

}
