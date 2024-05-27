package com.utn.redes.publicacion;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Publicacion")
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contenido;
    private LocalDate fechaPublicacion;
    private String usuario;
    //private List<Comentario> comentarios;
    private EstadoPublicacion estado;
   // private List<Tag> tags;
}
