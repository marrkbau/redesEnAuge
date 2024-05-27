package com.utn.redes.like;

import com.utn.redes.Persistente;
import com.utn.redes.publicacion.Publicacion;
import jakarta.persistence.*;

@Entity
@Table(name = "like_publicacion")
public class LikePublicacion extends Persistente {

    @OneToOne
    private Publicacion publicacion;

    @Column(name = "motivo")
    private String motivo;

}
