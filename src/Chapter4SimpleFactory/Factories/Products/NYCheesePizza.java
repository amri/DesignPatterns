package Chapter4SimpleFactory.Factories.Products;

import Chapter4SimpleFactory.Factories.PizzaIngredientFactory;
import Chapter4SimpleFactory.Factories.Products.Pizza;

/**
 * Created by amri on 8/8/14.
 */
public class NYCheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public NYCheesePizza(PizzaIngredientFactory pizzaIngredientFactory)
    {
        super.type = "NY Cheese";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare()
    {

        System.out.println("We are preparing it differently");
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }

    @Override
    public void bake() {
        System.out.println("We also bake differently");
    }
}
