package Chapter4SimpleFactory.Factories;

import Chapter4SimpleFactory.Factories.Products.Ingredients.*;

/**
 * Created by amri on 8/8/14.
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
