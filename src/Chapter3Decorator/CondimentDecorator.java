package Chapter3Decorator;

/**
 * Created by amri on 8/8/14.
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
    public abstract int getSize();
    public abstract void setSize();

    @Override
    public double cost() {
        return 0;
    }
}
