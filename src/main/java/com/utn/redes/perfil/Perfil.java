package com.utn.redes.perfil;

import com.utn.redes.Persistente;
import com.utn.redes.publicacion.Publicacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Perfil")
public class Perfil extends Persistente {
  @Column(name = "sitio_web")
  private String sitioWeb;

  @Column(name = "ubicacion")
  private String ubicacion;

  @Column()
  private String urlFotoPerfil;
  private Usuario usuario;
  private List<Publicacion> publicaciones;
  private List<Perfil> seguidores;

}
