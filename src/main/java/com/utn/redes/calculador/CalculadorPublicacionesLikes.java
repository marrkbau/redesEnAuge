package com.utn.redes.calculador;

import com.utn.redes.Persistente;
import com.utn.redes.like.Like;
import com.utn.redes.perfil.Perfil;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "calculador_publicaciones_likes")
public class CalculadorPublicacionesLikes extends Persistente implements CalculadorInteres {


    @Override
    public Double calcularInteres(Perfil perfil, List<Like> likes) {
        return null;
    }
}
