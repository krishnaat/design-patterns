package com.pattern.design.observer;

/**
 * This class provides interface for the observers to implement, in order to get the notification of updates.
 */
public interface IObserver {
    public void update(float temp, float humidity);
}
