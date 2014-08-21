package Chapter7AdapterObject.Adaptee;

/**
 * Created by amri on 14/8/14.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
