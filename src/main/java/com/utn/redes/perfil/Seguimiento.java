package com.utn.redes.perfil;

import com.utn.redes.Persistente;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "seguimiento")
public class Seguimiento extends Persistente {

  @Column(name = "fecha_seguimiento")
  private LocalDateTime fechaSeguimiento;

  @OneToOne
  private Perfil seguidor;

  @OneToOne
  private Perfil seguido;
}
