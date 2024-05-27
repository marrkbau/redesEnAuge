package com.utn.redes.calculador;

import com.utn.redes.Persistente;
import com.utn.redes.like.Like;
import com.utn.redes.perfil.Perfil;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "calculador_comentario_likes")
public class CalculadorComentarioLikes extends Persistente implements CalculadorInteres {

  @Column(name = "ponderacion_comentarios")
  private Integer ponderacionComentarios;

  @Column(name = "ponderacion_likes")
  private Integer ponderacionLikes;


  @Override
  public Double calcularInteres(Perfil perfil, List<Like> likes) {
    return null;
  }

}
