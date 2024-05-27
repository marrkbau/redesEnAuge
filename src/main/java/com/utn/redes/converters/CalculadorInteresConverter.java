package com.utn.redes.converters;

import com.utn.redes.calculador.CalculadorComentarioLikes;
import com.utn.redes.calculador.CalculadorInteres;
import com.utn.redes.calculador.CalculadorPublicacionesLikes;
import jakarta.persistence.AttributeConverter;

public class CalculadorInteresConverter implements AttributeConverter<CalculadorInteres, String> {


    @Override
    public String convertToDatabaseColumn(CalculadorInteres calculadorInteres) {
        return switch (calculadorInteres.getClass().getSimpleName()) {
            case "CalculadorComentarioLikes" -> "CalculadorComentarioLikes";
            case "CalculadorPublicacionesLikes" -> "CalculadorPublicacionesLikes";
            default -> null;
        };
    }

    @Override
    public CalculadorInteres convertToEntityAttribute(String s) {
        return switch (s) {
            case "CalculadorComentarioLikes" -> new CalculadorComentarioLikes();
            case "CalculadorPublicacionesLikes" -> new CalculadorPublicacionesLikes();
            default -> null;
        };
    }
}
