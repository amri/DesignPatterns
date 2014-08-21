package Chapter4SimpleFactory.Factories.Products;

import Chapter4SimpleFactory.Factories.Products.Ingredients.*;

/**
 * Created by amri on 8/8/14.
 */
public abstract class Pizza {
    String type;

    public Dough dough;
    public Sauce sauce;
    public Veggies veggies[];
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clam;

    abstract void prepare();


    public void bake() {
        System.out.println("Baking " + type);

    }

    public void cut() {
        System.out.println("Cutting " + type);

    }

    public void box() {
        System.out.println("Boxing " + type);

    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "Using " + Dough.class.getName();
    }
}
