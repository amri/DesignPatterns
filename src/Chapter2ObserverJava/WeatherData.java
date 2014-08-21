package Chapter2ObserverJava;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by amri on 7/8/14.
 */
public class WeatherData extends Observable {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {

    }


    public void measurementChanged()
    {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float humid, float pressure) {
        this.temperature = temp;
        this.humidity = humid;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getTemperature() {
        return this.temperature;
    }

    public float getHumidity(){
        return this.humidity;
    }

    public float getPressure()
    {
        return this.pressure;
    }

}
