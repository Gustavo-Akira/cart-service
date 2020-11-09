package br.com.gustavoakira.cartService.controller;

import br.com.gustavoakira.cartService.model.Cart;
import br.com.gustavoakira.cartService.model.Item;
import br.com.gustavoakira.cartService.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping("/cart/{id}")
    public Cart getCart(@PathVariable String id){
        return cartService.findById(id).get();
    }

    @PostMapping("/cart/{id}")
    public Cart addItem(@PathVariable String id, @RequestBody Item item){
        return cartService.saveCart(id,item);
    }

    @DeleteMapping("/cart/{id}")
    public void removeCart(@PathVariable String id){
        cartService.deleteCart(id);
    }
}
