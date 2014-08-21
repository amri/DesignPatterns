package Chapter4SimpleFactory.Factories.Products;

import Chapter4SimpleFactory.Factories.Products.Pizza;

/**
 * Created by amri on 8/8/14.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}