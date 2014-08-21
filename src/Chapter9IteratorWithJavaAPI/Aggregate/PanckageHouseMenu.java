package Chapter9IteratorWithJavaAPI.Aggregate;

import java.util.ArrayList;

/**
 * Created by amri on 16/8/14.
 */
public class PanckageHouseMenu implements Menu {
    ArrayList<MenuItem> menuItemArrayList;

    public PanckageHouseMenu() {
        menuItemArrayList = new ArrayList<MenuItem>();
        MenuItem menuItem = new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries and blueberry syrup", true, 3.49);
        addMenuItem(menuItem);

        menuItem = new MenuItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
        addMenuItem(menuItem);
    }

    private void addMenuItem(MenuItem menuItem) {
        menuItemArrayList.add(menuItem);
    }

    public java.util.Iterator createIterator() {
        return menuItemArrayList.iterator();
    }
}
