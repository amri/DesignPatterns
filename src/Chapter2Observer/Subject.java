package Chapter2Observer;

/**
 * Created by amri on 7/8/14.
 */
public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer observer);
    public void notifyObserver();
}

interface Observer {
    public void update(float temp, float humidity, float pressure);
}

interface DisplayElement {
    public void display();
}

