package com.utn.redes.perfil;

import com.utn.redes.Persistente;
import com.utn.redes.calculador.CalculadorInteres;
import com.utn.redes.converters.CalculadorInteresConverter;
import com.utn.redes.publicacion.Publicacion;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Perfil")
public class Perfil extends Persistente {


  @Convert(converter = CalculadorInteresConverter.class)
  @Column
  private CalculadorInteres calculador;

  @Column(name = "sitio_web")
  private String sitioWeb;

  @Column(name = "ubicacion")
  private String ubicacion;

  @Column(name = "url_foto_perfil")
  private String urlFotoPerfil;

  @OneToOne
  @JoinColumn(referencedColumnName = "id")
  private Usuario usuario;

  @OneToMany
  @JoinColumn(referencedColumnName = "id")
  private List<Publicacion> publicaciones;

  @ManyToMany
  @JoinTable(
      name = "seguidores",
      joinColumns = @JoinColumn(name = "perfil_id"),
      inverseJoinColumns = @JoinColumn(name = "seguidor_id")
  )
  private List<Perfil> seguidores;
}
