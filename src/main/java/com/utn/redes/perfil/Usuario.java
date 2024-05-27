package com.utn.redes.perfil;

import com.utn.redes.Persistente;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;
import jdk.jfr.Registered;

@Entity
@Table(name = "usuario")
public class Usuario extends Persistente {
  private String nombreUsuario;
  private List<MedioContacto> mediosContactos;
  private String contrasenia;
  private LocalDateTime fechaRegistro;
}
