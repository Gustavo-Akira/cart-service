package br.com.gustavoakira.cartService.service;

import br.com.gustavoakira.cartService.model.Cart;
import br.com.gustavoakira.cartService.model.Item;
import br.com.gustavoakira.cartService.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository repository;

    @Override
    public Optional<Cart> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Cart saveCart( String id, Item item) {
        Cart cart = null;
        Optional<Cart> optionalCart = findById(id);
        if(optionalCart.equals(Optional.empty())){
            cart = new Cart(id);
        }else{
            cart = optionalCart.get();
        }
        cart.getItems().add(item);
        cart = repository.save(cart);
        return cart;
    }

    @Override
    public void deleteCart(String id) {
        repository.deleteById(id);
    }
}
