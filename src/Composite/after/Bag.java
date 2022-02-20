package Composite.after;

import Composite.before.Item;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component {

    // List의 타입은 Leaf의 타입이 아닌 Component 추상화 타입으로 설정
    // 이렇게 하는 이유는 확장성을 위함
    List<Component> items = new ArrayList<>();

    public void add(Component item) {
        items.add(item);
    }

    public List<Component> getItems() {
        return items;
    }

    @Override
    public int getPrice() {
        return items.stream().mapToInt(item -> item.getPrice()).sum();
    }
}
