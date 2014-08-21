package Chapter1;

/**
 * Created by amri on 7/8/14.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck()
    {

    }

    public abstract void display();
    public void swim()
    {
        System.out.println("All ducks float, even decoys!");
    }

    public void performFly()
    {
        flyBehavior.fly();
    }

    public void performQuack()
    {
        quackBehavior.quack();
    }

}
