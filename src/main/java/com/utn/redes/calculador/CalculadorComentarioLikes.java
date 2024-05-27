package com.utn.redes.calculador;

import com.utn.redes.like.Like;
import com.utn.redes.perfil.Perfil;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.util.List;


public class CalculadorComentarioLikes implements CalculadorInteres {

  @Column(name = "ponderacion_comentarios")
  private Integer ponderacionComentarios;

  @Column(name = "ponderacion_likes")
  private Integer ponderacionLikes;



  @Override
  public Double calcularInteres(Perfil perfil, List<Like> likes) {
    return null;
  }
}
