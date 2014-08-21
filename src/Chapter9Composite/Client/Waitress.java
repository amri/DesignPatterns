package Chapter9Composite.Client;

import Chapter9Composite.Aggregate.Menu;
import Chapter9Composite.Aggregate.MenuItem;
import Chapter9Composite.Component.MenuComponent;

import java.util.Iterator;

/**
 * Created by amri on 16/8/14.
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

}
