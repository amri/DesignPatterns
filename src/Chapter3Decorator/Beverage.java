package Chapter3Decorator;

/**
 * Created by amri on 8/8/14.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription()
    {
        return description;
    }


    public abstract double cost();
}



