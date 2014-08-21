package Chapter1;

/**
 * Created by amri on 7/8/14.
 */
public class MiniDuckSimulator {
    public static void main(String[] args)
    {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }
}
