package Iterator;

import java.util.List;

public class ForwardIterator<T> implements MyIterator<T> {

    private int current;
    private int size;
    private List<T> list;

    public ForwardIterator(List<T> list) {
        this.list = list;
        this.size = list.size();
        this.current = 0;
    }

    @Override
    public boolean hasNext() {
        return this.size > this.current;
    }

    @Override
    public T currentItem() {
        return this.list.get(this.current++);
    }
}
