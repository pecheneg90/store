package pro.sky.java.course2.store.data;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Item {
    private final List<Integer> itemList;

    public Item() {
        this.itemList = new ArrayList<>();
    }

    public void addItems(List<Integer> item) {
        itemList.addAll(item);
    }

    public List<Integer> getItems() {
        return itemList;
    }
}