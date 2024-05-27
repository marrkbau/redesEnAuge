package com.utn.redes.like;

import com.utn.redes.Persistente;
import com.utn.redes.publicacion.Publicacion;
import jakarta.persistence.*;

@Entity
@DiscriminatorValue("like_publicacion")
public class LikePublicacion extends Like {

    @OneToOne
    private Publicacion publicacion;

    @Column(name = "motivo")
    private String motivo;

}
