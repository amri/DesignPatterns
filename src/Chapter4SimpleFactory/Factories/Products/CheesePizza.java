package Chapter4SimpleFactory.Factories.Products;

import Chapter4SimpleFactory.Factories.Products.Pizza;

/**
 * Created by amri on 8/8/14.
 */
public class CheesePizza extends Pizza {

    public CheesePizza()
    {
        super.type = "Cheese";
    }

    @Override
    void prepare() {
        System.out.println("Preparing Cheese Pizza");
    }
}
