package Chapter1;

/**
 * Created by amri on 7/8/14.
 */
public class MallardDuck extends Duck {

    public MallardDuck()
    {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
            }

    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }

}
