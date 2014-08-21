package Chapter4SimpleFactory;

import Chapter4SimpleFactory.Factories.Products.Pizza;
import Chapter4SimpleFactory.Factories.Products.NYPizzaStore;
import Chapter4SimpleFactory.Factories.Products.PizzaStore;

/**
 * Created by amri on 8/8/14.
 */
public class PizzaStoreMain
{
    public static void main(String[] args) {
        try {
            PizzaStore pizzaStore = new NYPizzaStore();
            Pizza nyCheesePizza = pizzaStore.orderPizza("Cheese");
            System.out.println(nyCheesePizza.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
