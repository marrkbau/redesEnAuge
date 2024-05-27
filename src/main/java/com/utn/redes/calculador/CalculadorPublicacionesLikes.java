package com.utn.redes.calculador;

import com.utn.redes.like.Like;
import com.utn.redes.perfil.Perfil;
import jakarta.persistence.Table;

import java.util.List;

@Table(name = "calculador_publicaciones_likes")
public class CalculadorPublicacionesLikes implements CalculadorInteres {


  @Override
  public Double calcularInteres(Perfil perfil, List<Like> likes) {
    return null;
  }


}
