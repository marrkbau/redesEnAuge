package com.utn.redes.perfil;

import com.utn.redes.Persistente;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "medio_contacto")
public class MedioContacto extends Persistente {

  @Enumerated(EnumType.STRING)
  private TipoContacto tipoContacto;

  @Column(name = "valor")
  private String valor;
}
