package br.com.gustavoakira.cartService.model;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("item")
public class Item {
    private String productId;
    private Integer amount;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
