package Chapter9Iterator.Client;

import Chapter9Iterator.Aggregate.DinerMenu;
import Chapter9Iterator.Aggregate.PanckageHouseMenu;

/**
 * Created by amri on 16/8/14.
 */
public class WaitressTest {

    public static void main(String[] args) {
        PanckageHouseMenu panckageHouseMenu = new PanckageHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(panckageHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
