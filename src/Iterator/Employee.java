package Iterator;

import java.util.ArrayList;
import java.util.List;

public class Employee<T> {

    private final List<T> list = new ArrayList<>();

    public List<T> getList() {
        return list;
    }

    public void print(MyIterator<T> iterator) {
        while (iterator.hasNext()) {
            T item = iterator.currentItem();
            System.out.println("item = " + item);
        }
    }

    public void add(T i) {
        this.list.add(i);
    }
}
