package com.pattern.design.observer.display.observers;

import com.pattern.design.observer.IObserver;
import com.pattern.design.observer.WeatherData;
import lombok.Getter;

/**
 * This is one of the observers registered to the subject.
 */
public class CurrentConditionsDisplay implements IDisplayElement, IObserver {

    @Getter
    private float temperature;

    @Getter
    private float humidity;

    /**
     * The subject being observed here is weatherData.
     */
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * This class provides the post subject update actions which the observers can perform.
     */
    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
