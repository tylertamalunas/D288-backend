package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name ="status_types")
@Data
// this is an enum
public class StatusType {

}
