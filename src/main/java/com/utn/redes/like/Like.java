package com.utn.redes.like;

import com.utn.redes.Persistente;
import com.utn.redes.perfil.Perfil;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import org.hibernate.id.factory.internal.AutoGenerationTypeStrategy;

import java.time.LocalDate;

@Entity
public class Like extends Persistente {

    @Column(name = "fecha_me_gusta")
    private LocalDate fechaMeGusta;

    @OneToOne
    private Perfil likeador;

    @Column(name = "activo")
    private Boolean activo;

}
