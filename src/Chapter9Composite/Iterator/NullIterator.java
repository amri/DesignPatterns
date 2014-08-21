package Chapter9Composite.Iterator;

import java.util.*;

/**
 * Created by amri on 17/8/14.
 */
public class NullIterator implements java.util.Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
