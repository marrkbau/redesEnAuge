package com.utn.redes.like;

import com.utn.redes.perfil.Perfil;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import org.hibernate.id.factory.internal.AutoGenerationTypeStrategy;

import java.time.LocalDate;

@Entity
public class Like {

  @Id
  private Long id;


  private LocalDate fechaMeGusta;

  @OneToOne
  private Perfil likeador;

  private Boolean activo;

}
