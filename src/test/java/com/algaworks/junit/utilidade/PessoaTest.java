package com.algaworks.junit.utilidade;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PessoaTest {

  @Test
  void assercaoAgrupada() {
    Pessoa pessoa = new Pessoa("Diego", "Teste");

    assertAll("Asserções de pessoas",
        () -> assertEquals("Diego", pessoa.getNome()),
        () -> assertEquals("Teste", pessoa.getSobrenome()));
  }

}