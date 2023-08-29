package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/order")
public class CartController {

    private final CartService cartService;
    private final ServiceA serviceA;

    public CartController(CartService cartService, ServiceA serviceA) {
        this.cartService = cartService;
        this.serviceA = serviceA;
    }
    @GetMapping("/add")
    public void add(@RequestParam Integer[] ids) {
        cartService.add(ids);
    }
    @GetMapping("/get")
    public List<Integer> get() {
        return cartService.all();
    }
}