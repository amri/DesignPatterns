package Chapter10State;

/**
 * Created by amri on 18/8/14.
 */
public interface State {
    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
}
