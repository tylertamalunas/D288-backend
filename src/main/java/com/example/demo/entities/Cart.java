package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;


@Entity
@Table(name ="carts")
@Data
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private Long id;
    private String orderTrackingNumber;
    private BigDecimal package_price;
    private int party_size;
    private StatusType status;

    @ManyToOne
    private Customer customer;
    private Date create_date;
    private Date last_update;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<CartItem> CartItem;

}
