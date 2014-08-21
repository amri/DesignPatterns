package Chapter3Decorator;

/**
 * Created by amri on 8/8/14.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend";

    }

    @Override
    public double cost() {
        return .89;
    }
}
