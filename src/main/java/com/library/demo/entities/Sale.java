package com.library.demo.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_sale")
public class Sale implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "sale")
    private List<ItemSale> items = new ArrayList<>();

    public Sale() {
    }

    public Sale(Long id, LocalDate date, User user) {
        this.id = id;
        this.date = date;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public User getUser() {
        return user;
    }

    public List<ItemSale> getItems() {
        return items;
    }

    public BigDecimal getTotal() {
        BigDecimal total = BigDecimal.ZERO;

        for (ItemSale item : items) {
            total = total.add(item.getSubTotal());
        }

        return total;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Sale)) return false;
        Sale other = (Sale) obj;
        return Objects.equals(id, other.id);
    }
}

