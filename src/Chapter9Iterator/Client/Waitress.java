package Chapter9Iterator.Client;

import Chapter9Iterator.Aggregate.DinerMenu;
import Chapter9Iterator.Iterator.Iterator;
import Chapter9Iterator.Aggregate.MenuItem;
import Chapter9Iterator.Aggregate.PanckageHouseMenu;

/**
 * Created by amri on 16/8/14.
 */
public class Waitress {
    PanckageHouseMenu panckageHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PanckageHouseMenu panckageHouseMenu, DinerMenu dinerMenu) {
        this.panckageHouseMenu = panckageHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = panckageHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        printMenu(pancakeIterator);
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem item = (MenuItem) iterator.next();
            System.out.println(item.getName() + ": " + item.getDescription());
            System.out.println(item.getPrice());
        }
    }
}
