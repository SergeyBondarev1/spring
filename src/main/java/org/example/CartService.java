package org.example;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
public class CartService {

    private final Cart cart;

    public CartService(Cart cart) {
        this.cart = cart;
    }

    public void add(Integer[] ids) {
        cart.add(ids);
    }

    public List<Integer> all() {
        return cart.getAll();
    }
}