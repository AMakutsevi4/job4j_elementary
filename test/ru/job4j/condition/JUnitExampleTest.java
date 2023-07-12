package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.assertThat;

public class JUnitExampleTest {

    @Disabled("Need to fix impl")
    @RepeatedTest(2)
    @DisplayName("When 5 multi 5 should be 25")
      void when5and5then254() {
        JUnitExample example = new JUnitExample();
        int result = example.multiply(5,5);
        assertThat(result).isEqualTo(25);
    }

    @Timeout(3)
    @Test
    void when5and5then25() throws InterruptedException {
        Thread.sleep(5000);
        JUnitExample example = new JUnitExample();
        int result = example.multiply(5,5);
        assertThat(result).isEqualTo(25);
    }
}