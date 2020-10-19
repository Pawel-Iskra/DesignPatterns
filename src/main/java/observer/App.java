package observer;

import observer.observable.WeatherForecast;
import observer.observers.InternetNews;
import observer.observers.RadioNews;

public class App {
    public static void main(String[] args) {
        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();

        WeatherForecast weatherForecast = new WeatherForecast(17, 1007);
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);

        weatherForecast.notifyRegisteredObservers();
        weatherForecast.changeForecast(21, 1019);

        weatherForecast.unregisterObserver(radioNews);
        weatherForecast.changeForecast(29, 998);
    }
}
