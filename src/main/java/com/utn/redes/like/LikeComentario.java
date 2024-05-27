package com.utn.redes.like;

import com.utn.redes.publicacion.Comentario;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "like_comentario")
public class LikeComentario extends Like {

    @Column(name = "comentario")
    @OneToOne
    private Comentario comentario;
}
