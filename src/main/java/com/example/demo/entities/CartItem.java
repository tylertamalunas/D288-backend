package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name ="cart_items")
@Data
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_item_id")
    private Long id;

    @ManyToOne
    private Vacation vacation;

    @ManyToOne
    private Cart cart;
    private Date create_date;
    private Date last_update;

    @ManyToMany
    private Set<Excursion> excursions;

}
