package observer.observers;

import observer.observable.WeatherForecast;

public class RadioNews implements Observer{
    public void update(WeatherForecast weatherForecast) {
        System.out.println(String.format(
                "Radio news: new forecast for the city: temperature -> %d, pressure -> %d",
                weatherForecast.getTemperature(), weatherForecast.getPressure()));
    }
}
