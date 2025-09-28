package com.algaworks.junit.utilidade;

import static com.algaworks.junit.utilidade.SaudacaoUtil.saudar;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
    assertThat(saudacao).isEqualTo("Bom dia");
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
  public void Dado_uma_hora_invalida_Quando_saudar_Entao_deve_lancar_exception() {
    int horaInvalida = -10;
    assertThatThrownBy(() -> saudar(horaInvalida))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage("Hora inválida");
  }

  @Test
  void naoDeveLancarException() {
    assertDoesNotThrow(() -> saudar(10));
  }

}