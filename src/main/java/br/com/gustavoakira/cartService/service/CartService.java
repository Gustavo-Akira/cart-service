package br.com.gustavoakira.cartService.service;

import br.com.gustavoakira.cartService.model.Cart;
import br.com.gustavoakira.cartService.model.Item;

import java.util.Optional;

public interface CartService {
    public Optional<Cart> findById(String id);
    public Cart saveCart(String id, Item item);
    public void deleteCart(String id);
}
