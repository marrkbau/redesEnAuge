package com.utn.redes.converters;

import com.utn.redes.calculador.CalculadorInteres;
import jakarta.persistence.AttributeConverter;

public class CalculadorInteresConverter implements AttributeConverter<CalculadorInteres, String> {


  @Override
  public String convertToDatabaseColumn(CalculadorInteres calculadorInteres) {
    return null;
  }

  @Override
  public CalculadorInteres convertToEntityAttribute(String s) {
    return null;
  }
}
