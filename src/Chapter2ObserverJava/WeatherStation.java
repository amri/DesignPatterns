package Chapter2ObserverJava;

import Chapter2ObserverJava.CurrentConditionsDisplay;

/**
 * Created by amri on 7/8/14.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80, 60, 30.4f);
    }
}
