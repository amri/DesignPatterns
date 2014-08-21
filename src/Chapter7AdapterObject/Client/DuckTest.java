package Chapter7AdapterObject.Client;

import Chapter7AdapterObject.Adaptee.Turkey;
import Chapter7AdapterObject.Adaptee.WildTurkey;
import Chapter7AdapterObject.Adapter.DuckAdapter;
import Chapter7AdapterObject.Adapter.TurkeyAdapter;
import Chapter7AdapterObject.Target.Duck;
import Chapter7AdapterObject.Target.Mallard;

/**
 * Created by amri on 14/8/14.
 */
public class DuckTest {
    public static void main(String[] args) {
        Turkey wildTurkey = new WildTurkey();
        Duck mallardDuck = new Mallard();

        wildTurkey.fly();
        wildTurkey.gobble();

        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);
        testDuck(turkeyAdapter);

        DuckAdapter duckAdapter = new DuckAdapter(mallardDuck);
        testTurkey(duckAdapter);

    }

    static void testDuck(Duck duck) {
        duck.fly();
        duck.quack();
    }

    static void testTurkey(Turkey turkey) {
        turkey.fly();
        turkey.gobble();
    }
}
