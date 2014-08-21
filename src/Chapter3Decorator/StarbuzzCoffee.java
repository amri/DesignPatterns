package Chapter3Decorator;

/**
 * Created by amri on 8/8/14.
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage darkRoast = new Espresso();
        darkRoast = new Whip(darkRoast);
        darkRoast = new Soy(darkRoast);
        System.out.println(darkRoast.getDescription() + ": " + darkRoast.cost());
    }
}
