package com.utn.redes.publicacion;

import com.utn.redes.Persistente;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Tag")
@Getter
@Setter
public class Tag extends Persistente {

    @Column(name = "nombre")
    private String nombre;

}
