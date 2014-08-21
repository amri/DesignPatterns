package Chapter7AdapterObject.Adapter;

import Chapter7AdapterObject.Adaptee.Turkey;
import Chapter7AdapterObject.Target.Duck;

/**
 * Created by amri on 14/8/14.
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
