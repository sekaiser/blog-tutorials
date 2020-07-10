package de.rieckpil.blog;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NestedTest {

  @Nested
  class DivisionTests {

    @Test
    public void shouldDivideByTwo() {
      assertEquals(4, 8 / 2);
    }

    @Test
    public void shouldThrowExceptionForDivideByZero() {
      assertThrows(ArithmeticException.class, () -> {
        int result = 8 / 0;
      });
    }
  }

  @Nested
  class AdditionTests {

    @Test
    public void shouldAddTwo() {
      assertEquals(4, 2 + 2);
    }

    @Test
    public void shouldAddZero() {
      assertEquals(2, 2 + 0);
    }
  }

}
