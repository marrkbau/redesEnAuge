package com.utn.redes.like;

import com.utn.redes.publicacion.Comentario;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "like_comentario")
public class LikeComentario {

  @Column(name = "comentario")
  @OneToOne
  private Comentario comentario;

  @Id
  private Long id;

}
