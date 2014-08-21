package Chapter3Decorator;

/**
 * Created by amri on 8/8/14.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription()
    {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public int getSize() {
        return 3;
    }

    @Override
    public void setSize() {

    }

    public double cost()
    {
        return .20 + beverage.cost();
    }

}
