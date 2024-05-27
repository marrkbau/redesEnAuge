package com.utn.redes.like;

import com.utn.redes.publicacion.Publicacion;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "like_publicacion")
public class LikePublicacion {

  @Id
  private Long id;

  @OneToOne
  private Publicacion publicacion;

  private String motivo;

}
