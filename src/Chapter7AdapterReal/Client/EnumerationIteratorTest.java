package Chapter7AdapterReal.Client;

import Chapter7AdapterReal.Adapter.IteratorEnumeratorAdapter;

import java.util.ArrayList;
import java.util.Enumeration;

/**
 * Created by amri on 14/8/14.
 */
public class EnumerationIteratorTest {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("amri");
        stringArrayList.add("chitra");

        IteratorEnumeratorAdapter iteratorEnumeratorAdapter = new IteratorEnumeratorAdapter(stringArrayList.iterator());
        testEnumerator(iteratorEnumeratorAdapter);

    }

    static void testEnumerator(Enumeration enumeration) {
        System.out.println(enumeration.nextElement().toString());
        System.out.println(enumeration.hasMoreElements());
        System.out.println(enumeration.nextElement().toString());
        System.out.println(enumeration.hasMoreElements());
    }
}
