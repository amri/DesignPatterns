package Chapter9IteratorWithJavaAPI.Aggregate;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by amri on 16/8/14.
 */
public class CafeMenu implements Menu {
    Hashtable menuItems;

    public CafeMenu() {
        menuItems = new Hashtable();
        addItem("Coffee", "Black Cofee", true, 1.01);

    }

    private void addItem(String name, String description, boolean isVegie, double price) {
        MenuItem menuItem = new MenuItem(name, description, isVegie, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
