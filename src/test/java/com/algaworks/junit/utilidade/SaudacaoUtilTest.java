package com.algaworks.junit.utilidade;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class SaudacaoUtilTest {

  @Test
  public void saudar() {
    var saudacao = SaudacaoUtil.saudar(12);
    assertEquals("Boa tarde", saudacao, "Saudação incorreta");
  }

  @Test
  public void deveLancarException() {
    var exception = assertThrows(IllegalArgumentException.class,
        () -> SaudacaoUtil.saudar(-10));

    assertEquals("Hora inválida", exception.getMessage());
  }

  @Test
  public void naoDeveLancarException() {
    assertDoesNotThrow(() -> SaudacaoUtil.saudar(10));
  }

}