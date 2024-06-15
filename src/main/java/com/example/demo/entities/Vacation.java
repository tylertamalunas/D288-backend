package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name ="vacation")
@Data
public class Vacation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vacation_id")
    private Long id;
    private String vacation_title;
    private String description;
    private BigDecimal travel_price;
    private String image_URL;
    private Date create_date;
    private Date last_update;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Excursion> excursions;

}
