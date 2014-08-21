package Chapter4SimpleFactory.Factories.Products;

/**
 * Created by amri on 8/8/14.
 */
public class ClamPizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("Preparing Clam Pizza");
    }
}
