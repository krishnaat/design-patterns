package com.pattern.design.singleton;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class SingletonPatternTest {

    private final Integer ZERO = 0;
    private final Integer ONE = 1;

    /**
     * This method tests singleton pattern created using enum.
     * @see EnumSingleton
     */
    @Test
    public void enumSingletonTest() {
        EnumSingleton firstInstance = EnumSingleton.INSTANCE;
        firstInstance.setValue(ZERO);
        Assert.assertEquals(firstInstance.getValue(), ZERO);

        EnumSingleton secondInstance = EnumSingleton.INSTANCE;
        secondInstance.setValue(ONE);
        // Both firstInstance and secondInstance refer to the same object and initialization is done only once.
        Assert.assertEquals(firstInstance.getValue(), ONE);
        Assert.assertEquals(secondInstance.getValue(), ONE);
    }

    /**
     * This method tests singleton pattern created using double checked locking.
     * @see DoubleCheckedLockingSingleton
     */
    @Test
    public void doubleCheckedLockingSingletonTest() {
        DoubleCheckedLockingSingleton firstReferenceObject = DoubleCheckedLockingSingleton.getInstance();
        firstReferenceObject.setValue(ZERO);
        Assert.assertEquals(firstReferenceObject.getValue(), ZERO);

        DoubleCheckedLockingSingleton secondReferenceObject = DoubleCheckedLockingSingleton.getInstance();
        secondReferenceObject.setValue(ONE);
        Assert.assertEquals(firstReferenceObject.getValue(), ONE);
        Assert.assertEquals(secondReferenceObject.getValue(), ONE);
    }

    /**
     * This method tests lazy initialized singleton pattern with synchronized method
     * @see Singleton
     */
    @Test
    public void syncronizedGetInstanceSingletonTest() {
        Singleton firstReferenceObject = Singleton.getInstance();
        firstReferenceObject.setValue(ZERO);
        Assert.assertEquals(firstReferenceObject.getValue(), ZERO);

        Singleton secondReferenceObject = Singleton.getInstance();
        secondReferenceObject.setValue(ONE);
        Assert.assertEquals(firstReferenceObject.getValue(), ONE);
        Assert.assertEquals(secondReferenceObject.getValue(), ONE);
    }
}
