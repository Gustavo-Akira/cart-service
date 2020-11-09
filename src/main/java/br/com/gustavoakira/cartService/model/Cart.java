package br.com.gustavoakira.cartService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;
import java.util.List;

@RedisHash("cart")
public class Cart {
    @Id
    private String id;
    private List<Item> items;

    public Cart(String id){
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public List<Item> getItems() {
        if(items == null){
            items = new ArrayList<>();
        }
        return items;
    }
}
