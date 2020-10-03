package com.pattern.design.observer;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the data/subject which is being observed by the observer
 */
public class WeatherData implements ISubject {

    /**
     * This field is being used to store the list of observers being registered to the subject
     */
    private List<IObserver> IObservers;

    /**
     * Temperature are 2 data points are being published to the observers.
     */
    @Getter
    private float temperature;

    @Getter
    private float humidity;

    public WeatherData() {
        IObservers = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver o) {
        IObservers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        IObservers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (IObserver IObserver : IObservers) {
            IObserver.update(temperature, humidity);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }


    /**
     * Whenever a new mesurement is set by the sensors, it updates the respective information &  the notifiers eventually gets notified.
     */
    public void setMeasurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        measurementsChanged();
    }

}
