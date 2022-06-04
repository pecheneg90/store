package pro.sky.java.course2.store.service;

import java.util.List;

public interface BasketService {

    List<Integer> addItem(List<Integer> addItem);

    List<Integer> getItems();
}