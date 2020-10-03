package com.pattern.design.observer;

import com.pattern.design.observer.display.observers.CurrentConditionsDisplay;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ObserverPatternTest {

    @Test
    public void weatherStationTest() {
        //Clients of the data use this object to initialize their object
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 60);
//        As the data changes the states, it gets notified to all the observers for post update processings.
        Assert.assertEquals(80, currentDisplay.getTemperature(), 0.0001);
        Assert.assertEquals(60, currentDisplay.getHumidity(), 0.00001);

        weatherData.setMeasurements(43, 30);
        Assert.assertEquals(43, currentDisplay.getTemperature(), 0.0001);
        Assert.assertEquals(30, currentDisplay.getHumidity(), 0.00001);
    }
}
