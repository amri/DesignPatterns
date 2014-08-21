package Chapter9IteratorWithJavaAPI.Client;

import Chapter9IteratorWithJavaAPI.Aggregate.Menu;
import Chapter9IteratorWithJavaAPI.Aggregate.MenuItem;

import java.util.Iterator;

/**
 * Created by amri on 16/8/14.
 */
public class Waitress {
    Menu panckageHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(Menu panckageHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.panckageHouseMenu = panckageHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        java.util.Iterator pancakeIterator = panckageHouseMenu.createIterator();
        java.util.Iterator dinerIterator = dinerMenu.createIterator();
        Iterator cafeIterator = cafeMenu.createIterator();

        printMenu(pancakeIterator);
        printMenu(dinerIterator);
        printMenu(cafeIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem item = (MenuItem) iterator.next();
            System.out.println(item.getName() + ": " + item.getDescription());
            System.out.println(item.getPrice());
        }
    }
}
