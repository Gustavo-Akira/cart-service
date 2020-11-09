package br.com.gustavoakira.cartService.repository;

import br.com.gustavoakira.cartService.model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart, String> {
}
