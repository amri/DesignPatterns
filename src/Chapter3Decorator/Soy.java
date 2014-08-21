package Chapter3Decorator;

/**
 * Created by amri on 8/8/14.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage)
    {
        this.beverage = beverage;
    }

    public double cost() {
        return 0.15 + beverage.cost();
    }

    @Override
    public String getDescription() {

        return beverage.getDescription() + ", Soy";
    }

    @Override
    public int getSize() {
        return 2;
    }

    @Override
    public void setSize() {

    }
}
