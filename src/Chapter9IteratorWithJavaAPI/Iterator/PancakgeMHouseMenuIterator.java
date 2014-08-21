package Chapter9IteratorWithJavaAPI.Iterator;

import Chapter9IteratorWithJavaAPI.Aggregate.MenuItem;

import java.util.ArrayList;

/**
 * Created by amri on 16/8/14.
 */
public class PancakgeMHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakgeMHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {

        if(position >= menuItems.size()) {
            return false;
        }
        else
            return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
