package observer.observable;

import observer.observers.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {

    private int temperature;
    private int pressure;
    private Set<Observer> observers = new HashSet<Observer>();

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyRegisteredObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void changeForecast(int newTemperature, int newPressure) {
        this.setTemperature(newTemperature);
        this.setPressure(newPressure);
        notifyRegisteredObservers();
    }
}
