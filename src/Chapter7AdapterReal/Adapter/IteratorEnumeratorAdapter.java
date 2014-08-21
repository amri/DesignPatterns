package Chapter7AdapterReal.Adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by amri on 14/8/14.
 */
public class IteratorEnumeratorAdapter implements Enumeration {
    Iterator iterator;

    public IteratorEnumeratorAdapter(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
