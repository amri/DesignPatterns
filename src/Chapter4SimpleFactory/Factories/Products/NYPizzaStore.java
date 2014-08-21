package Chapter4SimpleFactory.Factories.Products;

import Chapter4SimpleFactory.Factories.NYPizzaIngredientFactory;

/**
 * Created by amri on 8/8/14.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type.equals("Cheese")) {
            pizza = new NYCheesePizza(new NYPizzaIngredientFactory());
        }
        else if(type.equals("Clam")) {
            pizza = new ClamCheesePizza();
        }

        return pizza;

    }
}