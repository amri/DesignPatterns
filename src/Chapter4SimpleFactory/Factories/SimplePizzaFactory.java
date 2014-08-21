package Chapter4SimpleFactory.Factories;

import Chapter4SimpleFactory.Factories.Products.CheesePizza;
import Chapter4SimpleFactory.Factories.Products.ClamPizza;
import Chapter4SimpleFactory.Factories.Products.Pizza;

/**
 * Created by amri on 8/8/14.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type)
    {
        Pizza pizza = null;

        if(type.equals("Cheese"))
        {
            pizza = new CheesePizza();
        }
        else if(type.equals("Clam"))
        {
            pizza = new ClamPizza();
        }
        return pizza;
    }
}
