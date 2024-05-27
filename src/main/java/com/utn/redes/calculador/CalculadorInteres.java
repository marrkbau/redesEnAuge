package com.utn.redes.calculador;

import com.utn.redes.like.Like;
import com.utn.redes.perfil.Perfil;

import java.util.List;

public interface CalculadorInteres {

  public Double calcularInteres(Perfil perfil, List<Like> likes);

}
