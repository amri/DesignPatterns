package Chapter3Decorator;

/**
 * Created by amri on 8/8/14.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage)
    {
        this.beverage = beverage;
    }

    public double cost()
    {
        return .10 + beverage.cost();
    }

    @Override
    public String getDescription() {

        return beverage.getDescription() + ", Whip";
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void setSize() {

    }
}
