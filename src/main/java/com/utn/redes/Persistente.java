package com.utn.redes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@Entity
@MappedSuperclass
public class Persistente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
