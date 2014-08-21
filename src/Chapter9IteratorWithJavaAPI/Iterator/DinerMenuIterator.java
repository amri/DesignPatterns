package Chapter9IteratorWithJavaAPI.Iterator;

import Chapter9IteratorWithJavaAPI.Aggregate.MenuItem;

/**
 * Created by amri on 16/8/14.
 */
public class DinerMenuIterator implements java.util.Iterator {
    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        }
        else
            return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Couldn't remove");
    }
}
