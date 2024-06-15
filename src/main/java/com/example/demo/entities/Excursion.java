package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name ="excursions")
@Data
public class Excursion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "excursion_id")
    private Long id;
    private String excursion_title;
    private BigDecimal excursion_price;
    private String image_URL;

    @ManyToOne
    private Vacation vacation;
    private Date create_date;
    private Date last_update;

    @ManyToMany
    private Set<CartItem> cartitems;

}
