package Chapter8Template;

/**
 * Created by amri on 15/8/14.
 */
public abstract class BeverageTemplate {
    final void prepareBeverage() {
        boilWater();
        brewBeverage();
        pourWater();
        if (customerWantsCondiments()) {
            addCondiments();    
        }
        
    }

    boolean customerWantsCondiments() {
        return true;
    }

    abstract void brewBeverage();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling some water");
    }

    void pourWater() {
        System.out.println("Pouring the water");
    }
}
