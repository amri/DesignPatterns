package Chapter2ObserverJava;

import java.util.*;

/**
 * Created by amri on 7/8/14.
 */
public class ForecastDisplay implements java.util.Observer, DisplayElement  {
    private float curentPressure = 29.5f;
    private float lastPressure;
    private Observable observable;

    public ForecastDisplay(Observable observable)
    {
        this.observable = observable;
        observable.addObserver(this);

    }

    @Override
    public void display() {
        System.out.println("Last Pressure : " + lastPressure);
        System.out.println("Curent Pressure : " + curentPressure);
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)observable;
            lastPressure = curentPressure;
            this.curentPressure = weatherData.getPressure();
            display();
        }
    }
}
