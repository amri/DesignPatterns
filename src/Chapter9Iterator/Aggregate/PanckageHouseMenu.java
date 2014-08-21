package Chapter9Iterator.Aggregate;

import Chapter9Iterator.Iterator.Iterator;
import Chapter9Iterator.Iterator.PancakgeMHouseMenuIterator;

import java.util.ArrayList;

/**
 * Created by amri on 16/8/14.
 */
public class PanckageHouseMenu {
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

    public Iterator createIterator() {
        return new PancakgeMHouseMenuIterator(menuItemArrayList);
    }
}
