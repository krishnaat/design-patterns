package com.pattern.design.observer;

/**
 * 1. It provides an interface for the subject which has to be observed by the observers
 * 2. It provides the ways to register, remove and notify the observers.
 */
public interface ISubject {

    // By default methods are public abstract.
    void registerObserver(IObserver o);
    void removeObserver(IObserver o);
    void notifyObservers();
}
