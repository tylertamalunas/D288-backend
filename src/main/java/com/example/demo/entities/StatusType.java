package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
import java.util.Set;


@Table(name ="status_types")
// this is an enum
public enum StatusType {
    pending, ordered, canceled
}
