package com.utn.redes.like;

import com.utn.redes.publicacion.Comentario;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue("like_comentario")
public class LikeComentario extends Like {

    @OneToOne
    private Comentario comentario;
}
