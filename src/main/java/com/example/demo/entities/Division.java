package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name ="divisions")
@Data
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "division_id")
    private Long id;
    private String division_name;
    private Date create_date;
    private Date last_update;

    @ManyToOne
    private Country country;
    private Long country_id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Customer> customers;


}
