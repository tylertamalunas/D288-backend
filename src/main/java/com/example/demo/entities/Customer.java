package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name ="customers")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String postal_code;
    private String phone;
    private Date create_date;
    private Date last_update;

    @ManyToOne
    private Division division;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Cart> carts;
}
