package com.pattern.design.observer.display.observers;

import com.pattern.design.observer.IObserver;
import com.pattern.design.observer.WeatherData;

/**
 * This is one of the observers registered to the subject.
 */
public class ForecastDisplay implements IDisplayElement, IObserver {

    private float currentPressure = 29.92f;
    private float lastPressure;

    /**
     * The subject being observed here is weatherData.
     */
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * This class provides the post subject update actions which the observers can perform.
     */
    public void update(float temp, float humidity) {
        lastPressure = currentPressure;
        display();
    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

}
