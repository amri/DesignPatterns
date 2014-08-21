package Chapter9IteratorWithJavaAPI.Aggregate;

import Chapter9IteratorWithJavaAPI.Iterator.DinerMenuIterator;

/**
 * Created by amri on 16/8/14.
 */
public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("BLT", "Bacon with Lettuce and Tomato", true, 2.99);
    }

    private void addItem(String blt, String s, boolean b, double v) {
        MenuItem menuItem = new MenuItem(blt, s, b, v);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full");
        } else {
            menuItems[numberOfItems] = menuItem;
        }
    }

    public java.util.Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
