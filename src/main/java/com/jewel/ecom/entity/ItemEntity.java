package com.jewel.ecom.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "item")
public class ItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "uuid default random_uuid()")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "unit_price")
    private BigDecimal price;

    @ManyToMany(mappedBy = "items", fetch = FetchType.LAZY)
    private List<CartEntity> cart;

    @ManyToMany(mappedBy = "items", fetch = FetchType.LAZY)
    private List<OrderEntity> orders;

    // getter setter

    public UUID getId() {
        return id;
    }

    public ItemEntity setId(UUID id) {
        this.id = id;
        return this;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public ItemEntity setProduct(ProductEntity product) {
        this.product = product;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ItemEntity setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public ItemEntity setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ItemEntity that = (ItemEntity) o;
        return quantity == that.quantity && product.equals(that.product) && Objects
                .equals(price, that.price);// && Objects.equals(cart, that.cart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, price, quantity);//, cart);
    }

    public List<CartEntity> getCart() {
        return cart;
    }

    public ItemEntity setCart(List<CartEntity> cart) {
        this.cart = cart;
        return this;
    }

    public List<OrderEntity> getOrders() {
        return orders;
    }

    public ItemEntity setOrders(List<OrderEntity> orders) {
        this.orders = orders;
        return this;
    }
}