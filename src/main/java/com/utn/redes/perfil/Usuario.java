package com.utn.redes.perfil;

import com.utn.redes.Persistente;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;
import jdk.jfr.Registered;

@Entity
@Table(name = "usuario")
public class Usuario extends Persistente {

  @Column
  private String nombreUsuario;

  @OneToMany
  @JoinColumn(referencedColumnName = "id")
  private List<MedioContacto> mediosContactos;

  @Column
  private String contrasenia;

  @Column
  private LocalDateTime fechaRegistro;
}
