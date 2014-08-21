package Chapter2Observer;

import java.util.ArrayList;

/**
 * Created by amri on 7/8/14.
 */
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementChanged()
    {
        notifyObserver();
    }

    public void setMeasurements(float temp, float humid, float pressure) {
        this.temperature = temp;
        this.humidity = humid;
        this.pressure = pressure;
        measurementChanged();
    }

}
