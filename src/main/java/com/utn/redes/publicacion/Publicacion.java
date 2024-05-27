package com.utn.redes.publicacion;

import com.utn.redes.Persistente;
import com.utn.redes.perfil.Perfil;
import com.utn.redes.perfil.Usuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Publicacion")
@Getter
@Setter
public class Publicacion extends Persistente {

    @Column(name = "contenido")
    private String contenido;

    @Column(name = "fecha_publicacion")
    private LocalDate fechaPublicacion;

    @OneToOne
    private Perfil perfil;

    @ManyToMany
    @JoinTable(name = "publicacion_compartida",
            joinColumns = @JoinColumn(name = "publicacion_id"),
            inverseJoinColumns = @JoinColumn(name = "perfil_id"))
    private List<Comentario> comentarios;

    @Enumerated(EnumType.STRING)
    private EstadoPublicacion estado;

    @OneToMany
    @JoinTable(name = "publicacion_tag",
            joinColumns = @JoinColumn(name = "publicacion_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private List<Tag> tags;
}
