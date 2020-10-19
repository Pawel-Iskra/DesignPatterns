package observer.observers;

import observer.observable.WeatherForecast;

public interface Observer {
    void update(WeatherForecast weatherForecast);
}
