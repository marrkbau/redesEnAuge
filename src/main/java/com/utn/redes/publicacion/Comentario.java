package com.utn.redes.publicacion;

import com.utn.redes.perfil.Perfil;

import java.time.LocalDate;

public class Comentario {
    private String texto;
    private LocalDate fechaComentario;
    private Perfil comentador;
    private Publicacion publicacion;
}
