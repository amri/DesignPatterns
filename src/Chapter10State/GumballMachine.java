package Chapter10State;

/**
 * Created by amri on 18/8/14.
 */
public class GumballMachine {
    State noQuarterState;
    State hasQuarterState;

    State state = noQuarterState;
    int count = 0;

    public GumballMachine(int count) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);

        this.count = count;
        if (this.count > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling");
        if (count != 0) {
            count = count - 1;
        }
    }
}
