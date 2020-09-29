package com.pattern.design.decorator;

import com.pattern.design.decorator.bevarage.options.Espresso;
import com.pattern.design.decorator.condiment.options.Milk;
import com.pattern.design.decorator.condiment.options.Mocha;
import com.pattern.design.decorator.condiment.options.Whip;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class DecoratorPatternTest {

//    TODO: Mock these data in test
    private final double ESPRESSO_MEDIUM_SIZE_COST = 1.99;
    private final double MILK_MEDIUM_SIZE_COST = 0.15;
    private final double MOCHA_MEDIUM_SIZE_COST = 0.20;
    private final double WHIP_MEDIUM_SIZE_COST = 0.10;

    @Test
    public void testStarBuzzDecoratorPatternDesign() {
        Beverage beverage = new Espresso();
        beverage.setSize(Beverage.Size.MEDIUM);
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        Assert.assertEquals(beverage.cost(), 2.44,0.0001);
    }
}
