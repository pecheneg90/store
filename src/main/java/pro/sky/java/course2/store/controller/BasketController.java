package pro.sky.java.course2.store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.store.service.BasketService;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public List<Integer> add(@RequestParam(name = "id") List<Integer> item) {
        return basketService.addItem(item);
    }

    @GetMapping("/get")
    Collection<Integer> getAllItems() {
        return basketService.getItems();
    }
}