package com.algaworks.junit.utilidade;

import java.time.Duration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimuladorEsperaTest {

  @Test
  void deveEsperarENaoDarTimeout() {
    Assertions.assertTimeoutPreemptively(
        Duration.ofSeconds(1), () -> SimuladorEspera.esperar(Duration.ofMillis(10)));
  }

}