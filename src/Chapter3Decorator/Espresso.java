package Chapter3Decorator;

/**
 * Created by amri on 8/8/14.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";

    }



    @Override
    public double cost() {
        return 1.99;
    }
}
