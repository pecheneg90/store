package pro.sky.java.course2.store.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.store.data.Item;

import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {
    private final Item items;

    public BasketServiceImpl(Item item) {
        this.items = item;
    }

    @Override
    public List<Integer> addItem(List<Integer> itemId) {
        items.addItems(itemId);
        return itemId;
    }

    @Override
    public List<Integer> getItems() {
        return items.getItems();
    }
}