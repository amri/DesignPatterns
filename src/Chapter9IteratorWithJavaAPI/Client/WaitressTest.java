package Chapter9IteratorWithJavaAPI.Client;

import Chapter9IteratorWithJavaAPI.Aggregate.CafeMenu;
import Chapter9IteratorWithJavaAPI.Aggregate.DinerMenu;
import Chapter9IteratorWithJavaAPI.Aggregate.PanckageHouseMenu;

/**
 * Created by amri on 16/8/14.
 */
public class WaitressTest {

    public static void main(String[] args) {
        PanckageHouseMenu panckageHouseMenu = new PanckageHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(panckageHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}
