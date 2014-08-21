package Chapter7AdapterObject.Adapter;

import Chapter7AdapterObject.Adaptee.Turkey;
import Chapter7AdapterObject.Target.Duck;

/**
 * Created by amri on 14/8/14.
 */
public class DuckAdapter implements Turkey {
    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
        System.out.println("From Adapter");
    }

    @Override
    public void fly() {
        duck.fly();
        System.out.println("From Adapter");
    }
}
