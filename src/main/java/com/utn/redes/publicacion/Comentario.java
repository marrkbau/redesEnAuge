package com.utn.redes.publicacion;

import com.utn.redes.Persistente;
import com.utn.redes.perfil.Perfil;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "Comentario")
@Getter
@Setter
public class Comentario extends Persistente {

    @Column(name = "texto")
    private String texto;
    @Column(name = "fecha_comentario")
    private LocalDate fechaComentario;
    @OneToOne
    private Perfil comentador;
    @ManyToOne
    private Publicacion publicacion;
}
