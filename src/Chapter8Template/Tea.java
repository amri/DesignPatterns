package Chapter8Template;

/**
 * Created by amri on 15/8/14.
 */
public class Tea extends BeverageTemplate {

    @Override
    void brewBeverage() {
        System.out.println("Brewing Tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Add milk");
    }

}
