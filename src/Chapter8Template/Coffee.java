package Chapter8Template;

/**
 * Created by amri on 15/8/14.
 */
public class Coffee extends BeverageTemplate {
    @Override
    boolean customerWantsCondiments() {
        return false;
    }

    @Override
    void brewBeverage() {
        System.out.println("Brewing Coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding some milk to the cofee");
    }
}
