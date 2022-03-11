package Iterator;

import java.util.List;

public class ReverseIterator<T> implements MyIterator<T> {

    private int current;
    private int size;
    private List<T> list;

    public ReverseIterator(List<T> list) {
        this.list = list;
        this.size = list.size();
        this.current = list.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return 0 <= this.current;
    }

    @Override
    public T currentItem() {
        return this.list.get(this.current--);
    }
}
