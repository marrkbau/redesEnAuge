package com.utn.redes.perfil;

import com.utn.redes.Persistente;
import com.utn.redes.calculador.CalculadorInteres;
import com.utn.redes.publicacion.Publicacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.util.List;

@Entity
@Table(name = "Perfil")
public class Perfil extends Persistente {


  private CalculadorInteres calculadorInteresUsado;

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
