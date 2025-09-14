package com.algaworks.junit.utilidade;

import static com.algaworks.junit.utilidade.SaudacaoUtil.saudar;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SaudacaoUtilTest {

  @Test
  @DisplayName("Deve saudar com bom dia")
  public void saudarComBomDia() {
    //Arrange
    int horaValida = 9;

    //Act
    String saudacao = saudar(horaValida);

    //Assert
    assertEquals("Bom dia", saudacao);
  }

  @Test
  public void saudarComBomDiaAPartir5h() {
    int horaValida = 5;
    String saudacao = saudar(horaValida);
    assertEquals("Bom dia", saudacao);
  }

  @Test
  public void saudarComBoaTarde() {
    int horaValida = 15;
    String saudacao = saudar(horaValida);
    assertEquals("Boa tarde", saudacao);
  }

  @Test
  public void saudarComBoaNoite() {
    int horaValida = 22;
    String saudacao = saudar(horaValida);
    assertEquals("Boa noite", saudacao);
  }

  @Test
  void deveLancarException() {
    int horaInvalida = -10;
    var exception = assertThrows(IllegalArgumentException.class,
        () -> saudar(horaInvalida));

    assertEquals("Hora inválida", exception.getMessage());
  }

  @Test
  void naoDeveLancarException() {
    assertDoesNotThrow(() -> saudar(10));
  }

}