package Chapter4SimpleFactory.Factories.Products;

import Chapter4SimpleFactory.Factories.Products.Pizza;

/**
 * Created by amri on 8/8/14.
 */
public class ClamCheesePizza extends Pizza {
    public ClamCheesePizza()
    {
        super.type = "NY Clam";
    }

    @Override
    void prepare() {
        System.out.println("Preparring NY Clam");
    }
}
